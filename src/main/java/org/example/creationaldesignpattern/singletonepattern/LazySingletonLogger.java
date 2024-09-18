package org.example.creationaldesignpattern.singletonepattern;

public class LazySingletonLogger {
  private static LazySingletonLogger logger;
  private String message;
  private LazySingletonLogger() {}

  public static LazySingletonLogger getInstance() {
    if(logger == null) {
      logger = new LazySingletonLogger();
    }

    return logger;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
