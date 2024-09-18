package org.example.creationaldesignpattern.pizzaexercise;

import org.example.creationaldesignpattern.pizzaexercise.enums.PizzaTypeEnum;

public class PizzaMain {
  public static void main(String[] args) {
    GreenwichFactory greenwich = new GreenwichFactory();
    PizzaHutFactory pizzaHut = new PizzaHutFactory();

    System.out.println("Greenwich: ");
    greenwich.createDough().prepareDough();
    greenwich.createCheese().addCheese();
    greenwich.createPizza(PizzaTypeEnum.HAWAIIAN).preparePizza();
    greenwich.franchise();

    System.out.println("\n====================================\n");

    System.out.println("Pizza Hut: ");
    pizzaHut.createDough().prepareDough();
    pizzaHut.createCheese().addCheese();
    pizzaHut.createPizza(PizzaTypeEnum.PEPPERONI).preparePizza();
    pizzaHut.franchise();
  }

}
