package org.example.structuraldesignpattern.adapterpattern.shape;

public class ShapeMain {

  public static void main(String[] args) {
    LegacyShape legacyShape = new Rectangle();
    legacyShape.drawLegacyShape();

    ModernShape modernShape = new ModernShapeAdapter(legacyShape);
    modernShape.drawModernShape();
  }
}
