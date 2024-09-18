package org.example.structuraldesignpattern.adapterpattern.demo;

public class CarbonaraAdapter implements Pasta {
  private Carbonara carbonara;

  public Pasta getCarbonara(Carbonara carbonara) {
    this.carbonara = carbonara;
    return this;
  }

  @Override
  public String getName() {
    return carbonara.getName();
  }

  @Override
  public String getPasta() {
    return carbonara.getPasta();
  }

  @Override
  public String getSauce() {
    return carbonara.getCream();
  }
}
