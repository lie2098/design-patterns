package org.example.behavioral.observerpattern.weatherstation.observer;

import org.example.behavioral.observerpattern.weatherstation.weatherstation.Weather;

public class ObserverImpl implements Observer{
  private String subscriber;
  private Weather weather;

  public ObserverImpl(String subscriber) {
    this.subscriber = subscriber;
  }

  @Override
  public void notify(Weather weather, String subscriber) {
    this.weather = weather;
    this.subscriber  = subscriber;
    System.out.println(subscriber + " received notification");
  }

  @Override
  public void getForecast() {
    System.out.println("Weather Forecast:");
    System.out.println("DateTime: " + weather.getDateTime());
    System.out.println("Weather Condition: " + weather.getWeatherCondition());
    System.out.println("Temperature: " + weather.getTemperature());
    System.out.println("Pressure: " + weather.getPressure());
  }

  @Override
  public void action() {
    System.out.println(this.subscriber + " is now taking action");
    System.out.println("Sending Message to Admin Panel to request ADHOC WFH");
    System.out.println("Admin Panel Noticed and Marked as Abusive");
    System.out.println("All ISD is now affected and no more WFH is allowed");
  }

  public String getSubscriber() {
    return subscriber;
  }
}
