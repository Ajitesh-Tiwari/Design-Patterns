package com.learning.design.patterns.structural.composite;

public class Leaf implements IElement {

  private String id;

  public Leaf(String id) {
    this.id = id;
  }

  @Override
  public void print() {
    System.out.println(id);
  }
}
