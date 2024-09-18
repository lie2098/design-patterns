package org.example.structuraldesignpattern.adapterpattern.demo;

public class AdapterMain {

  public static void main(String[] args) {
    CarbonaraAdapter adapterMain = new CarbonaraAdapter();
    Carbonara carbonara = new Carbonara("Carbonara", "Alfredo", "Fettuccine");

    Pasta spaghetti = new Spaghetti("Spaghetti", "Tomato", "Angel Hair");
    Pasta carbonaraPasta = adapterMain.getCarbonara(carbonara);

    System.out.println("spaghetti:");
    printPasta(spaghetti);

    System.out.println("\ncarbonara:");
    printPasta(carbonaraPasta);
  }

  private static void printPasta(Pasta pasta) {
    System.out.println("Name: " + pasta.getName());
    System.out.println("Pasta: " + pasta.getPasta());
    System.out.println("Sauce: " + pasta.getSauce());
  }
}
