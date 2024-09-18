package org.example.creationaldesignpattern.pizzaexercise.cheese;

public class MargheritaCheese implements Cheese {

  public MargheritaCheese(boolean isSpecial) {
    if(isSpecial) {
      System.out.println("Broccoli added");
      System.out.println("Gorgonzola added");
      System.out.println("Mushroom added");
    }
  }
  public void addCheese() {
    System.out.println("Margherita cheese added");
  }

}
