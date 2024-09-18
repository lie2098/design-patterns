package org.example.creationaldesignpattern.prototypepattern;

import java.util.HashMap;
import org.example.creationaldesignpattern.prototypepattern.enums.ShapeEnum;
import org.example.creationaldesignpattern.prototypepattern.shapes.Shape;

public class PrototypeRegistry {
  private static HashMap<ShapeEnum, Shape> shapeMap = new HashMap<>();

  private PrototypeRegistry() {}

  public static void addRegistry(ShapeEnum shapeEnum, Shape shape) {
    shapeMap.put(shapeEnum, shape);
  }

  public static Shape getShape(ShapeEnum shapeEnum) {
    return shapeMap.get(shapeEnum);
  }
}
