package com.learning.design.patterns.creational.factorymethod;

public class SpecializedStoreTwo implements Store {

  @Override
  public Product create(String productType) {

    switch (productType) {
      case "ONE":
        return new SpecializedProductOneFromStoreTwo();
      case "TWO":
        return new SpecializedProductTwoFromStoreTwo();
    }

    return null;
  }
}
