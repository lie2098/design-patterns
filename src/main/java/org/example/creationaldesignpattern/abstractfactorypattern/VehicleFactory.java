package org.example.creationaldesignpattern.abstractfactorypattern;

import org.example.creationaldesignpattern.abstractfactorypattern.bicycle.Bicycle;
import org.example.creationaldesignpattern.abstractfactorypattern.bicycle.Giant;
import org.example.creationaldesignpattern.abstractfactorypattern.bicycle.Scott;
import org.example.creationaldesignpattern.abstractfactorypattern.bicycle.Trek;
import org.example.creationaldesignpattern.abstractfactorypattern.cars.BMW;
import org.example.creationaldesignpattern.abstractfactorypattern.cars.Car;
import org.example.creationaldesignpattern.abstractfactorypattern.cars.Lamborghini;
import org.example.creationaldesignpattern.abstractfactorypattern.cars.Mercedes;
import org.example.creationaldesignpattern.abstractfactorypattern.enums.BicycleEnum;
import org.example.creationaldesignpattern.abstractfactorypattern.enums.CarEnum;

public class VehicleFactory extends AbstractFactory{

  @Override
  Car getCar(CarEnum carType) throws ClassNotFoundException {
    switch (carType) {
      case MERCEDES:
        return new Mercedes();
      case BMW:
        return new BMW();
      case LAMBORGHINI:
        return new Lamborghini();
      default:
        throw new ClassNotFoundException("Car not found " + carType);
    }
  }

  @Override
  Bicycle getBicycle(BicycleEnum bicycleType) throws ClassNotFoundException {
    switch (bicycleType) {
      case GIANT:
        return new Giant();
      case SCOTT:
        return new Scott();
      case TREK:
        return new Trek();
      default:
        throw new ClassNotFoundException("Bicycle not found " + bicycleType);
    }
  }
}
