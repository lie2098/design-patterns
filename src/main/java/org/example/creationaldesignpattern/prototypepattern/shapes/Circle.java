package org.example.creationaldesignpattern.prototypepattern.shapes;

public class Circle implements Shape {
  private final double radius;

  public Circle() {
    this.radius = 6.9;
  }
  public Circle(Circle circle) {
    this.radius = circle.radius;
  }

  @Override
  public Circle copy() {
    return new Circle(this);
  }

  @Override
  public void display() {
    System.out.println("Circle with radius " + radius);
  }
}
