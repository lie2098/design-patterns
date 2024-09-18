package org.example.creationaldesignpattern.pizzaexercise.pizza;

public class VeggiePizza implements Pizza {
    @Override
    public void preparePizza() {
      System.out.println("Preparing Veggie Pizza");
    }
}
