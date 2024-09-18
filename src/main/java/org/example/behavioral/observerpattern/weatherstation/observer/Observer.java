package org.example.behavioral.observerpattern.weatherstation.observer;

import org.example.behavioral.observerpattern.weatherstation.weatherstation.Weather;

public interface Observer {
  void notify(Weather weather, String subscriber);

  void getForecast();
  void action();
  String getSubscriber();
}
