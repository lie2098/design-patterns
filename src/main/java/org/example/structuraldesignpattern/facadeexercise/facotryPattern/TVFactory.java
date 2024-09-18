package org.example.structuraldesignpattern.facadeexercise.facotryPattern;

import org.example.structuraldesignpattern.facadeexercise.enums.TVEnum;
import org.example.structuraldesignpattern.facadeexercise.television.LG;
import org.example.structuraldesignpattern.facadeexercise.television.Samsung;
import org.example.structuraldesignpattern.facadeexercise.television.Sony;
import org.example.structuraldesignpattern.facadeexercise.television.Television;

public class TVFactory {
  public static Television getTV(TVEnum tvType) throws ClassNotFoundException {
    switch (tvType) {
      case LG:
        return new LG();
      case SAMSUNG:
        return new Samsung();
      case SONY:
        return new Sony();
      default:
        throw new ClassNotFoundException(tvType + " not found");
    }
  }
}
