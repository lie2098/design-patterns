package org.example.creationaldesignpattern.abstractfactorypattern.bicycle;

public class Giant implements Bicycle {

  @Override
  public double getSpeed() {
    return 100;
  }

  @Override
  public String name() {
    return "Giant";
  }
}
