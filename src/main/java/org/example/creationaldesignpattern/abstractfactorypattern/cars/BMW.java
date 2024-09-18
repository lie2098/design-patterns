package org.example.creationaldesignpattern.abstractfactorypattern.cars;

public class BMW implements Car{

  @Override
  public double getSpeed() {
    return 200;
  }

  @Override
  public String name() {
    return "BMW";
  }
}
