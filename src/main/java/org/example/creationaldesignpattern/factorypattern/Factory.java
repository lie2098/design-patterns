package org.example.creationaldesignpattern.factorypattern;

import org.example.creationaldesignpattern.factorypattern.enums.ProductTypeEnum;
import org.example.creationaldesignpattern.factorypattern.products.Burger;
import org.example.creationaldesignpattern.factorypattern.products.Fries;
import org.example.creationaldesignpattern.factorypattern.products.MixAndMatch;
import org.example.creationaldesignpattern.factorypattern.products.Product;
import org.example.creationaldesignpattern.factorypattern.products.Spaghetti;

public class Factory extends CreatorFactory {
  public Product getProduct(ProductTypeEnum type) throws ClassNotFoundException {
    switch(type) {
      case FRIES:
        return new Fries();
      case BURGER:
        return new Burger();
      case SPAGHETTI:
        return new Spaghetti();
      case MIXANDMATCH:
        return new MixAndMatch();
      default:
        throw new ClassNotFoundException("Product not found " + type);
    }
  }
}
