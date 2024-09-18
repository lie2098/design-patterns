package org.example.creationaldesignpattern.abstractfactorypattern.bicycle;

public class Scott implements Bicycle {

  @Override
  public double getSpeed() {
    return 110;
  }

  @Override
  public String name() {
    return "Scott";
  }
}
