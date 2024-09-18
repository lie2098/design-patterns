package org.example.creationaldesignpattern.abstractfactorypattern;

import org.example.creationaldesignpattern.abstractfactorypattern.bicycle.Bicycle;
import org.example.creationaldesignpattern.abstractfactorypattern.cars.Car;
import org.example.creationaldesignpattern.abstractfactorypattern.enums.BicycleEnum;
import org.example.creationaldesignpattern.abstractfactorypattern.enums.CarEnum;

public abstract class AbstractFactory {
  abstract Car getCar(CarEnum carType) throws ClassNotFoundException;
  abstract Bicycle getBicycle(BicycleEnum bicycleType) throws ClassNotFoundException;
}
