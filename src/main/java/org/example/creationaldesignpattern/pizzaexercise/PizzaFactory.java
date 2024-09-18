package org.example.creationaldesignpattern.pizzaexercise;

import org.example.creationaldesignpattern.pizzaexercise.cheese.Cheese;
import org.example.creationaldesignpattern.pizzaexercise.dough.Dough;
import org.example.creationaldesignpattern.pizzaexercise.enums.PizzaTypeEnum;
import org.example.creationaldesignpattern.pizzaexercise.pizza.Pizza;

public abstract class PizzaFactory {
    public abstract Pizza createPizza(PizzaTypeEnum type);
    public abstract Dough createDough();
    public abstract Cheese createCheese();

    public void franchise() {
        System.out.println("You can now Franchise your favorite pizzaexercise store!");
    }
}
