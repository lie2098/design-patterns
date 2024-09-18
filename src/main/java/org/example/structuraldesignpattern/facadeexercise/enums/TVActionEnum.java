package org.example.structuraldesignpattern.facadeexercise.enums;

public enum TVActionEnum {
  ON,
  OFF,
  VOLUME_UP,
  VOLUME_DOWN,
  MUTE,
  NEXT_CHANNEL,
  PREVIOUS_CHANNEL,
  SELECT_CHANNEL,
  EXIT;

  public static TVActionEnum getActionEnum(String choice) {
    switch (choice) {
      case "1":
        return ON;
      case "2":
        return OFF;
      case "3":
        return VOLUME_UP;
      case "4":
        return VOLUME_DOWN;
      case "5":
        return MUTE;
      case "6":
        return NEXT_CHANNEL;
      case "7":
        return PREVIOUS_CHANNEL;
      case "8":
        return SELECT_CHANNEL;
      default:
        return EXIT;
    }
  }
}
