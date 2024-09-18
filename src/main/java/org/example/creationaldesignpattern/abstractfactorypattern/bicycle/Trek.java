package org.example.creationaldesignpattern.abstractfactorypattern.bicycle;

public class Trek implements Bicycle {

  @Override
  public double getSpeed() {
    return 120;
  }

  @Override
  public String name() {
    return "Trek";
  }
}
