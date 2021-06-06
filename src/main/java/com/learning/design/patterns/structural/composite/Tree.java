package com.learning.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Tree implements IElement {

  private List<IElement> leaves = new ArrayList<>();

  public void add(IElement leaf) {
    leaves.add(leaf);
  }

  public void remove(IElement leaf) {
    leaves.remove(leaf);
  }

  @Override
  public void print() {
    leaves.forEach(IElement::print);
  }
}
