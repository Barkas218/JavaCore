package pattern.observer.oberserver_normal.Subject;

import src.pattern.observer.oberserver_normal.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observerList;
    private Integer humidity;
    private Integer temperature;

    public WeatherStation(){
        observerList = new ArrayList<Observer>();
    }

    public void getNewData(Integer humidity, Integer temperature){
        this.humidity = humidity;
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(var observer : observerList){
            observer.update(humidity,temperature);
        }
    }
}
