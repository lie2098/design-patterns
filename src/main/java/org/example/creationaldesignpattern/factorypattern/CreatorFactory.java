package org.example.creationaldesignpattern.factorypattern;

import org.example.creationaldesignpattern.factorypattern.enums.ProductTypeEnum;
import org.example.creationaldesignpattern.factorypattern.products.MixAndMatch;
import org.example.creationaldesignpattern.factorypattern.products.Product;

public abstract class CreatorFactory {
  abstract Product getProduct(ProductTypeEnum type) throws ClassNotFoundException;

  public static void getProductOrder(ProductTypeEnum type) throws ClassNotFoundException {
    CreatorFactory create = new Factory();
    Product product = create.getProduct(type);

    System.out.println(product.productName());
    System.out.println(product.getPrice());

    if (type.equals(ProductTypeEnum.MIXANDMATCH)) {
      MixAndMatch mixandmatch = (MixAndMatch) product;
      mixandmatch.order();
    }
  }
}
