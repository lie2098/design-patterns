package org.example.codingdojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class DroneControl {
  private int batteryPower = 100;
  private final int consumePower = 1;

  private final List<String> moves = new ArrayList<>(Arrays.asList("F","U","L","D","R","B"));
  //X -> R/L
  //Y -> U/D
  //Z -> F/B
  private List<Integer> spacePosition = new ArrayList<>(Arrays.asList(0, 0,0));

  private int[][] maze ={
      {0, 0, 1},
      {1, 0, 1},
      {0, 0, 0}
  };

  public void moveMaze(List<String> input) {

  }

  public void returnStart() {
    List<String> backMovement = new ArrayList<>();
    AtomicInteger index = new AtomicInteger();
    spacePosition.forEach(item -> {
      int i = index.getAndIncrement();
      if (item != 0) {
        while (spacePosition.get(i) != 0) {
          if(i == 0) {
            backMovement.add(spacePosition.get(i) > 0 ? "L" : "R");
          }else if(i == 1) {
            backMovement.add(spacePosition.get(i) > 0 ? "D" : "U");
          }else {
            backMovement.add(spacePosition.get(i) > 0 ? "B" : "F");
          }

          int position = spacePosition.get(i) > 0 ? spacePosition.get(i) - 1 : spacePosition.get(i) + 1;
          spacePosition.set(i, position);
          batteryPower -= consumePower;
        }
      }
    });
    System.out.println(String.join(",", backMovement));
  }

  public void display() {
    System.out.println("Space Position: " + spacePosition.get(0) + ", " + spacePosition.get(1) + ", " + spacePosition.get(2));
    System.out.println("Battery Power: " + batteryPower + "%");
  }

  public void moveDrone(List<String> input) {
    for (String command : input) {
      Integer x = spacePosition.get(0);
      Integer y = spacePosition.get(1);
      Integer z = spacePosition.get(2);

      if(moves.contains(command)) {
        batteryPower -= consumePower;
        switch (command) {
          case "R":
            spacePosition.set(0, x + 1);
            break;
          case "L":
            spacePosition.set(0, x - 1);
            break;
          case "U":
            spacePosition.set(1, y + 1);
            break;
          case "D":
            spacePosition.set(1, y - 1);
            break;
          case "F":
            spacePosition.set(2, z + 1);
            break;
          case "B":
            spacePosition.set(2, z - 1);
            break;
          default:
            System.out.println("Invalid command: " + command);
            break;
        }
      }
    }
  }
}
