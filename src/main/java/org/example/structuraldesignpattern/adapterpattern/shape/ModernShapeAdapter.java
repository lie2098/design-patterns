package org.example.structuraldesignpattern.adapterpattern.shape;

public class ModernShapeAdapter implements ModernShape {
  private LegacyShape legacyShape;

  public ModernShapeAdapter(LegacyShape legacyShape) {
    this.legacyShape = legacyShape;
  }

  @Override
  public void drawModernShape() {
    legacyShape.drawLegacyShape();
  }
}
