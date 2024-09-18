package org.example.behavioral.observerpattern.weatherstation.weatherstation;

import org.example.behavioral.observerpattern.weatherstation.observer.Observer;

public interface WeatherStation {
  void subscribe(Observer observer);
  void unsubscribe(Observer observer);
  void notifyObservers();
}
