package org.example.creationaldesignpattern.abstractfactorypattern;

import org.example.creationaldesignpattern.abstractfactorypattern.bicycle.Bicycle;
import org.example.creationaldesignpattern.abstractfactorypattern.cars.Car;
import org.example.creationaldesignpattern.abstractfactorypattern.enums.BicycleEnum;
import org.example.creationaldesignpattern.abstractfactorypattern.enums.CarEnum;

public class AbstractMain {
  public static void main(String[] args) throws ClassNotFoundException {
    AbstractFactory vehicle = new VehicleFactory();

    Bicycle bicycle = vehicle.getBicycle(BicycleEnum.GIANT);
    System.out.println(bicycle.name());
    System.out.println(bicycle.getSpeed());

    Car car = vehicle.getCar(CarEnum.BMW);
    System.out.println(car.name());
    System.out.println(car.getSpeed());
  }
}
