package com.learning.design.patterns.creational.factorymethod;

public class FactoryMethodPattern {

  public static void main(String[] args) {
    Store store = new SpecializedStoreOne();
    Product productOne = store.create("ONE");
    Product productTwo = store.create("TWO");

    System.out.println(productOne);
    System.out.println(productTwo);
  }
}
