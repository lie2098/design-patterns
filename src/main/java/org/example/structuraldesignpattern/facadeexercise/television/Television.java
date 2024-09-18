package org.example.structuraldesignpattern.facadeexercise.television;

public abstract class Television {

  protected boolean isPowerOn = false;
  protected int volume = 20;
  protected boolean isMuted = false;
  protected int currentChannel = 69;

  public abstract void model();

  public boolean getIsPowerOn() {
    return this.isPowerOn;
  }

  public void powerOn() {
    if (this.isPowerOn) {
      System.out.println("TV is already on");
    } else {
      System.out.println("TV is on");
    }
    this.isPowerOn = true;
  }

  public void powerOff() {
    if (!this.isPowerOn) {
      System.out.println("TV is already off");
    } else {
      System.out.println("TV is off");
    }

    this.isPowerOn = false;
  }

  public int volumeUp() {
    if (this.isMuted) {
      this.isMuted = false;
      System.out.println("TV is no longer muted");
    }

    return ++this.volume;
  }

  public int volumeDown() {
    if (this.isMuted) {
      this.isMuted = false;
      System.out.println("TV is no longer muted");
    }

    return --this.volume;
  }

  public void mute() {
    if (!this.isPowerOn) {
      turnOnTvFirst();
      return;
    }

    this.isMuted = !this.isMuted;
    if (this.isMuted) {
      System.out.println("TV is muted");
    } else {
      System.out.println("TV is un-muted");
    }
  }

  public void nextChannel() {
    if (!this.isPowerOn) {
      turnOnTvFirst();
      return;
    }

    ++this.currentChannel;
    System.out.println("Channel: " + this.currentChannel);
  }

  public void previousChannel() {
    if (!this.isPowerOn) {
      turnOnTvFirst();
      return;
    }

    --this.currentChannel;
    System.out.println("Channel: " + this.currentChannel);
  }

  public void selectChannel(int channel) {
    if (!this.isPowerOn) {
      turnOnTvFirst();
      return;
    }

    this.currentChannel = channel;
    System.out.println("Channel: " + this.currentChannel);
  }

  private void turnOnTvFirst() {
    System.out.println("Please turn on the TV first");
  }
}
