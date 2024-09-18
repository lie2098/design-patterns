package org.example.structuraldesignpattern.adapterpattern.insurance.insuranceform;

import lombok.Data;

@Data
public class InsularLifeForm implements InsuranceForm{
  private String name;
  private String lastName;
  private String address;
  private String gender;
  private String policyNo;

  public InsularLifeForm(String name, String lastName, String address, String gender, String policyNo) {
    this.name = name;
    this.lastName = lastName;
    this.address = address;
    this.gender = gender;
    this.policyNo = policyNo;
  }
}
