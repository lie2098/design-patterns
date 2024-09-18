package org.example.creationaldesignpattern.prototypepattern;

import org.example.creationaldesignpattern.prototypepattern.enums.ShapeEnum;
import org.example.creationaldesignpattern.prototypepattern.shapes.Circle;
import org.example.creationaldesignpattern.prototypepattern.shapes.Shape;
import org.example.creationaldesignpattern.prototypepattern.shapes.Square;

public class PrototypeMain {

  public static void main(String[] args) {
    Shape circle = new Circle();
    Shape square = new Square();

    PrototypeRegistry.addRegistry(ShapeEnum.CIRCLE, circle.copy());
    PrototypeRegistry.addRegistry(ShapeEnum.SQUARE, square.copy());

    PrototypeRegistry.getShape(ShapeEnum.CIRCLE).display();
    PrototypeRegistry.getShape(ShapeEnum.SQUARE).display();
  }
}
