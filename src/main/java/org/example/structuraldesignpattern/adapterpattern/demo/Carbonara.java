package org.example.structuraldesignpattern.adapterpattern.demo;

public class Carbonara {
  private String name;
  private String cream;
  private String pasta;

  public Carbonara(String name, String cream, String pasta) {
    this.name = name;
    this.cream = cream;
    this.pasta = pasta;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCream() {
    return cream;
  }

  public void setCream(String cream) {
    this.cream = cream;
  }

  public String getPasta() {
    return pasta;
  }

  public void setPasta(String pasta) {
    this.pasta = pasta;
  }
}
