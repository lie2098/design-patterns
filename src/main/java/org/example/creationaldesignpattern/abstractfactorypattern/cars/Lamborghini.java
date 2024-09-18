package org.example.creationaldesignpattern.abstractfactorypattern.cars;

public class Lamborghini implements Car{

  @Override
  public double getSpeed() {
    return 300;
  }

  @Override
  public String name() {
    return "Lamborghini";
  }
}
