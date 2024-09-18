package org.example.codingdojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//   final List<String> input = new ArrayList<>(Arrays.asList("F","U","L","D","R","B"));
   final List<String> input2 = new ArrayList<>(Arrays.asList("F", "F", "U", "L", "R", "D", "B", "F", "R", "R", "U"));
   DroneControl droneControl = new DroneControl();
   droneControl.moveDrone(input2);
   droneControl.display();
   droneControl.returnStart();
  }
}
