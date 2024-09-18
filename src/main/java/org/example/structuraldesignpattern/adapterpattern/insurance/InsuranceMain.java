package org.example.structuraldesignpattern.adapterpattern.insurance;

import org.example.structuraldesignpattern.adapterpattern.insurance.insuranceform.InsularLifeForm;
import org.example.structuraldesignpattern.adapterpattern.insurance.insuranceform.InsuranceForm;
import org.example.structuraldesignpattern.adapterpattern.insurance.insuranceform.PruLifeForm;
import org.example.structuraldesignpattern.adapterpattern.insurance.insuranceform.SunLifeForm;
import org.example.structuraldesignpattern.adapterpattern.insurance.adapter.SunLifeFormAdapter;

public class InsuranceMain {

  public static void main(String[] args) {
    SunLifeFormAdapter adapter = new SunLifeFormAdapter();
    InsuranceForm insularLifeForm = new InsularLifeForm("John", "Doe", "Manila", "M", "1234");
    InsuranceForm pruLifeForm = new PruLifeForm("Jane", "Doe", "Cebu", "F", "5678");
    InsuranceForm sunLifeForm = adapter.sunLifeForm(new SunLifeForm("Juan", "Dela Cruz", "Davao", "M", "91011"));

    display("Insular Life", insularLifeForm);
    display("Pru Life", pruLifeForm);
    display("Sun Life", sunLifeForm)
    ;
  }

  private static void display(String insurance, InsuranceForm insuranceForm) {
    System.out.println(insurance + " Insurance Form");
    System.out.println("Name: " + insuranceForm.getName());
    System.out.println("Last Name: " + insuranceForm.getLastName());
    System.out.println("Address: " + insuranceForm.getAddress());
    System.out.println("Gender: " + insuranceForm.getGender());
    System.out.println("Policy No: " + insuranceForm.getPolicyNo());
    System.out.println("\n");
  }
}
