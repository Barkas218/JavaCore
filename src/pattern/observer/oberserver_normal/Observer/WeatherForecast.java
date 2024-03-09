package pattern.observer.oberserver_normal.Observer;

import src.pattern.observer.oberserver_normal.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecast implements Observer{

    private List<Integer> humidityData;
    private List<Integer> temperatureData;



    public WeatherForecast(Subject weatherStation){

        this.temperatureData = new ArrayList<Integer>();
        this.humidityData = new ArrayList<Integer>();
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(Integer temperature, Integer humidity) {
        this.temperatureData.add(temperature);
        this.humidityData.add(humidity);
        showTemp();
    }

    private void showTemp(){
        System.out.println("------------------ Weather Forecast -----------------");
        System.out.println("The average humidity is:" +getAverage(humidityData));
        System.out.println("The average temperature is:" +getAverage(temperatureData));
    }

    private double getAverage(List<Integer> list){
        double sum = 0;
        for (var l : list){
            sum +=l;
        }
        return sum/list.size();
    }

}
