package pattern.observer.oberserver_normal.Observer;

import src.pattern.observer.oberserver_normal.Subject.Subject;

public class CurrentCondtionsDisplay implements Observer{

    private Integer humidity;
    private Integer temperature;

    public CurrentCondtionsDisplay(Subject weatherStation){
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(Integer temperature, Integer humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        showTemp();
    }

    private void showTemp(){
        System.out.println("------------------ Current Data -----------------");
        System.out.println(temperature);
        System.out.println(humidity);
    }

}
