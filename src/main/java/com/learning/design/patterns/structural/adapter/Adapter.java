package com.learning.design.patterns.structural.adapter;

public class Adapter implements IAdapter {

  private Adaptee adaptee;

  public Adapter() {
    this.adaptee = new Adaptee();
  }

  @Override
  public String sum(String a, String b) {
    return String.valueOf(adaptee.sum(Integer.parseInt(a), Integer.parseInt(b)));
  }
}
