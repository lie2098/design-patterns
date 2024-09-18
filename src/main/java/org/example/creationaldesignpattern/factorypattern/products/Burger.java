package org.example.creationaldesignpattern.factorypattern.products;

public class Burger implements Product{

  @Override
  public double getPrice() {
    return 59;
  }

  @Override
  public String productName() {
    return "Burger";
  }
}
