package org.example.creationaldesignpattern.prototypepattern.shapes;

public class Square implements Shape {
  private final int sideLength;

  public Square() {
    this.sideLength = 5;
  }

  public Square(Square square) {
    this.sideLength = square.sideLength;
  }

  @Override
  public Square copy() {
    return new Square(this);
  }

  @Override
  public void display() {
    System.out.println("Square with side length " + sideLength);
  }
}
