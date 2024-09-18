package org.example.structuraldesignpattern.adapterpattern.demo;

public class Spaghetti implements Pasta {
  String name;
  String sauce;
  String pasta;

  public Spaghetti(String name, String sauce, String pasta) {
    this.name = name;
    this.sauce = sauce;
    this.pasta = pasta;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSauce() {
    return sauce;
  }

  public void setSauce(String sauce) {
    this.sauce = sauce;
  }

  public String getPasta() {
    return pasta;
  }

  public void setPasta(String pasta) {
    this.pasta = pasta;
  }
}
