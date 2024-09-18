package org.example.creationaldesignpattern.factorypattern.products;

public class MixAndMatch implements Product{

  @Override
  public double getPrice() {
    return 89;
  }

  @Override
  public String productName() {
    return "Mix & Match";
  }

  public void order() {
    System.out.println("Your Order: Jolly Hot dog & Sundae");
  }
}
