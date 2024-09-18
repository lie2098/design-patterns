package org.example.behavioral.observerpattern.weatherstation.weatherstation;

import java.util.ArrayList;
import java.util.List;
import org.example.behavioral.observerpattern.weatherstation.observer.Observer;

public class WeatherStationImpl implements WeatherStation{
  private Weather weather;
  List<Observer> observerList = new ArrayList<>();
  public WeatherStationImpl(Weather weather) {
    this.weather = weather;
  }

  @Override
  public void subscribe(Observer observer) {
    observerList.add(observer);
    System.out.println(observer.getSubscriber() + " subscribed");
  }

  @Override
  public void unsubscribe(Observer observer) {
    observerList.remove(observer);
    System.out.println(observer.getSubscriber() + " unsubscribed");
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observerList) {
      observer.notify(weather, observer.getSubscriber());
    }
  }
}
