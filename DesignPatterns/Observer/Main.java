package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String temprature = new String("0 C");
        List<Observer> observers = new ArrayList<>(
                Arrays.asList(
                        new PhoneScreen(temprature),
                        new WebScreen(temprature)
                )
        );
        WeatherData weatherData = new WeatherData(observers,temprature);
        temprature = new String("37 C");
        //temprature.replace('C', 'F');
        weatherData.updateWeather(temprature);
        temprature = new String("98 C");
        //temprature.replace('F', 'C');
        weatherData.updateWeather(temprature);
    }
}
