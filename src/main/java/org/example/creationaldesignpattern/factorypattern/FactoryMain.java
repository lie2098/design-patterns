package org.example.creationaldesignpattern.factorypattern;

import org.example.creationaldesignpattern.factorypattern.enums.ProductTypeEnum;

public class FactoryMain {
  public static void main(String[] args) throws ClassNotFoundException {
    CreatorFactory.getProductOrder(ProductTypeEnum.BURGER);
    CreatorFactory.getProductOrder(ProductTypeEnum.FRIES);
    CreatorFactory.getProductOrder(ProductTypeEnum.SPAGHETTI);
    CreatorFactory.getProductOrder(ProductTypeEnum.MIXANDMATCH);
  }
}
