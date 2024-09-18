package org.example.creationaldesignpattern.factorypattern.products;

public class Spaghetti implements Product{

  @Override
  public double getPrice() {
    return 79;
  }

  @Override
  public String productName() {
    return "Spaghetti";
  }
}
