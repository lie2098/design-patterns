package org.example.creationaldesignpattern.singletonepattern;

public class EarlySingletonLogger {
  private static EarlySingletonLogger logger = new EarlySingletonLogger();
  private String message;
  private int code;

  private EarlySingletonLogger() {}

  public static EarlySingletonLogger getInstance() {
    return logger;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }
}
