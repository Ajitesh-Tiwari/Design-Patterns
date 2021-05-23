package com.learning.design.patterns.creational.factorymethod;

public class SpecializedStoreOne implements Store {

  @Override
  public Product create(String productType) {

    switch (productType) {
      case "ONE":
        return new SpecializedProductOneFromStoreOne();
      case "TWO":
        return new SpecializedProductTwoFromStoreOne();
    }

    return null;
  }
}
