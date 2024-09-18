package org.example.creationaldesignpattern.factorypattern.products;

public class Fries implements Product{

  @Override
  public double getPrice() {
    return 69;
  }

  @Override
  public String productName() {
    return "Fries";
  }
}
