package org.example.creationaldesignpattern.singletonepattern;

public class SingletonMain {
  public static void main(String[] args) {
    EarlySingletonLogger earlySingletonLogger = EarlySingletonLogger.getInstance();
    earlySingletonLogger.setMessage("This is a message");
    earlySingletonLogger.setCode(200);

    System.out.println("first earlySingletonLogger" + earlySingletonLogger);
    System.out.println("message: " + earlySingletonLogger.getMessage());
    System.out.println("code: " + earlySingletonLogger.getCode());

    earlySingletonLogger = EarlySingletonLogger.getInstance();
    System.out.println("second earlySingletonLogger" + earlySingletonLogger);
    System.out.println("message: " + earlySingletonLogger.getMessage());
    System.out.println("code: " + earlySingletonLogger.getCode());

    LazySingletonLogger lazySingletonLogger = LazySingletonLogger.getInstance();
    lazySingletonLogger.setMessage("This is a message");
    System.out.println("first lazySingletonLogger" + lazySingletonLogger);
    System.out.println("message: " + lazySingletonLogger.getMessage());

    lazySingletonLogger = LazySingletonLogger.getInstance();
    System.out.println("second lazySingletonLogger" + lazySingletonLogger);
    System.out.println("message: " + lazySingletonLogger.getMessage());
  }

}
