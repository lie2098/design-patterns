package org.example.structuraldesignpattern.adapterpattern.shape;

public class Rectangle implements LegacyShape {

  @Override
  public void drawLegacyShape() {
    System.out.println("Drawing Rectangle");
  }
}
