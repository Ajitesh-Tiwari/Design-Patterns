package com.learning.design.patterns.structural.adapter;

public class Client {

  public static void main(String[] args) {
    IAdapter adapter = new Adapter();
    System.out.println(adapter.sum("1", "4"));
  }
}
