package DesignPatterns.Observer;

import java.util.List;


public class WeatherData extends Iobseravale{
    private String temprature;

    public WeatherData(List<Observer> observers, String temprature) {
        super(observers);
        this.temprature = temprature;
    }

    public void updateWeather(String temprature){
        this.temprature = temprature;
        notifyall(temprature);
    }

}
