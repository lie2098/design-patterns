package org.example.structuraldesignpattern.facadeexercise.enums;

public enum TVEnum {
  LG,
  SAMSUNG,
  SONY;

  public static TVEnum getTVModel(String choice) {
    switch (choice) {
      case "1":
        return TVEnum.LG;
      case "2":
        return TVEnum.SAMSUNG;
      case "3":
        return TVEnum.SONY;
      default:
        return null;
    }
  }
}
