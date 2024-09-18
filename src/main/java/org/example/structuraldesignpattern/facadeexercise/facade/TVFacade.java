package org.example.structuraldesignpattern.facadeexercise.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.example.structuraldesignpattern.facadeexercise.enums.TVActionEnum;
import org.example.structuraldesignpattern.facadeexercise.enums.TVEnum;
import org.example.structuraldesignpattern.facadeexercise.facotryPattern.TVFactory;
import org.example.structuraldesignpattern.facadeexercise.television.Television;

public class TVFacade {

  Television tv;

  public TVFacade(TVEnum tvEnum) throws ClassNotFoundException {
    this.tv = TVFactory.getTV(tvEnum);
  }

  public void action(TVActionEnum action) throws IOException {
    switch (action) {
      case ON:
        turnOnTv();
        break;
      case OFF:
        turnOffTv();
        break;
      case VOLUME_UP:
        addVolume();
        break;
      case VOLUME_DOWN:
        reduceVolume();
        break;
      case MUTE:
        mute();
        break;
      case NEXT_CHANNEL:
        nextChannel();
        break;
      case PREVIOUS_CHANNEL:
        previousChannel();
        break;
      case SELECT_CHANNEL:
        System.out.print("Enter channel number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int channel = Integer.parseInt(br.readLine());
        selectChannel(channel);
        break;
      case EXIT:
        System.out.println("Exiting...");
        break;
      default:
        System.out.println("Invalid action");
    }
  }

  public void model() {
    tv.model();
  }

  private void turnOnTv() {
    tv.model();
    tv.powerOn();
  }

  private void turnOffTv() {
    tv.model();
    tv.powerOff();
  }

  private void addVolume() {
    volumeHandling(tv.volumeUp());
  }

  private void reduceVolume() {
    volumeHandling(tv.volumeDown());
  }

  private void mute() {
    tv.mute();
  }

  private void nextChannel() {
    tv.nextChannel();
  }

  private void previousChannel() {
    tv.previousChannel();
  }

  private void selectChannel(int channel) {
    tv.selectChannel(channel);
  }

  private void volumeHandling(int volume) {
    if (!tv.getIsPowerOn()) {
      System.out.println("Please turn on the TV first");
    } else{
      System.out.println("Volume: " + volume);
    }
  }
}
