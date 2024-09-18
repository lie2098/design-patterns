package org.example.creationaldesignpattern.abstractfactorypattern.cars;

public class Mercedes implements Car{

  @Override
  public double getSpeed() {
    return 250;
  }

  @Override
  public String name() {
    return "Mercedes";
  }
}
