package org.example.structuraldesignpattern.facadeexercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.example.structuraldesignpattern.facadeexercise.enums.TVActionEnum;
import org.example.structuraldesignpattern.facadeexercise.enums.TVEnum;
import org.example.structuraldesignpattern.facadeexercise.facade.TVFacade;

public class FacadeMain {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    displayTV();

    String tvChoice = br.readLine();
    TVFacade tv = new TVFacade(TVEnum.getTVModel(tvChoice));

    System.out.println("\n\n");
    System.out.print("TV Model: ");
    tv.model();

    String actionChoice = "";
    do {
      displayAction();
      actionChoice = br.readLine();

      System.out.println("========================================");
      tv.action(TVActionEnum.getActionEnum(actionChoice));
      System.out.println("========================================");

    } while(!actionChoice.equals("9"));
  }

  private static void displayTV() {
    System.out.println("====== Facade Exercise ======");
    System.out.println("1. LG");
    System.out.println("2. Samsung");
    System.out.println("3. Sony");
    System.out.print("Select TV brand: ");
  }

  private static void displayAction() {
    System.out.println("\n");
    System.out.println("================ Action ================");
    System.out.println("1. ON");
    System.out.println("2. OFF");
    System.out.println("3. VOLUME UP");
    System.out.println("4. VOLUME DOWN");
    System.out.println("5. MUTE");
    System.out.println("6. NEXT CHANNEL");
    System.out.println("7. PREVIOUS CHANNEL");
    System.out.println("8. SELECT CHANNEL");
    System.out.println("9. EXIT");
    System.out.print("Please Enter Your Choice: ");
  }
}
