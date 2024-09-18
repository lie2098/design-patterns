package org.example.creationaldesignpattern.pizzaexercise;

import org.example.creationaldesignpattern.pizzaexercise.cheese.Cheese;
import org.example.creationaldesignpattern.pizzaexercise.cheese.MargheritaCheese;
import org.example.creationaldesignpattern.pizzaexercise.dough.Dough;
import org.example.creationaldesignpattern.pizzaexercise.dough.ThickCrustDough;
import org.example.creationaldesignpattern.pizzaexercise.enums.PizzaTypeEnum;
import org.example.creationaldesignpattern.pizzaexercise.pizza.HawaiianPizza;
import org.example.creationaldesignpattern.pizzaexercise.pizza.PepperoniPizza;
import org.example.creationaldesignpattern.pizzaexercise.pizza.Pizza;

public class PizzaHutFactory extends PizzaFactory {

  @Override
  public Pizza createPizza(PizzaTypeEnum type) {
    switch (type) {
      case HAWAIIAN:
        return new HawaiianPizza();
      case PEPPERONI:
        return new PepperoniPizza();
      default:
        throw new IllegalArgumentException(type + " Pizza is not available!");
    }
  }

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Cheese createCheese() {
    return new MargheritaCheese(true);
  }
}
