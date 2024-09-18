package org.example.structuraldesignpattern.adapterpattern.insurance.insuranceform;

import lombok.Data;

@Data
public class SunLifeForm {
  private String firstName;
  private String lastName;
  private String completeAddress;
  private String gender;
  private String policyNumber;

  public SunLifeForm(String firstName, String lastName, String completeAddress, String gender, String policyNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.completeAddress = completeAddress;
    this.gender = gender;
    this.policyNumber = policyNumber;
  }
}
