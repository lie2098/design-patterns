package org.example.behavioral.observerpattern.weatherstation;

import java.time.LocalDateTime;
import org.example.behavioral.observerpattern.weatherstation.observer.Observer;
import org.example.behavioral.observerpattern.weatherstation.observer.ObserverImpl;
import org.example.behavioral.observerpattern.weatherstation.weatherstation.Weather;
import org.example.behavioral.observerpattern.weatherstation.weatherstation.WeatherStation;
import org.example.behavioral.observerpattern.weatherstation.weatherstation.WeatherStationImpl;

public class WeatherStationMain {

  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStationImpl(getWeather());
    Observer mima = new ObserverImpl("Mima");

    weatherStation.subscribe(mima);
    weatherStation.notifyObservers();

    mima.getForecast();
    mima.action();
  }

  private static Weather getWeather() {
    Weather weather = new Weather();
    weather.setDateTime(LocalDateTime.now());
    weather.setWeatherCondition("Sunny");
    weather.setTemperature(30);
    weather.setPressure(1013);
    return weather;
  }
}
