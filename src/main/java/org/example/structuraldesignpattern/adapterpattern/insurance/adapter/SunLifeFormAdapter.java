package org.example.structuraldesignpattern.adapterpattern.insurance.adapter;

import org.example.structuraldesignpattern.adapterpattern.insurance.insuranceform.InsuranceForm;
import org.example.structuraldesignpattern.adapterpattern.insurance.insuranceform.SunLifeForm;

public class SunLifeFormAdapter implements InsuranceForm {
  private SunLifeForm sunLifeForm;

  public InsuranceForm sunLifeForm(SunLifeForm sunLifeForm) {
    this.sunLifeForm = sunLifeForm;
    return this;
  }

  @Override
  public String getName() {
    return sunLifeForm.getFirstName();
  }

  @Override
  public String getLastName() {
    return sunLifeForm.getLastName();
  }

  @Override
  public String getAddress() {
    return sunLifeForm.getCompleteAddress();
  }

  @Override
  public String getGender() {
    return sunLifeForm.getGender();
  }

  @Override
  public String getPolicyNo() {
    return sunLifeForm.getPolicyNumber();
  }
}
