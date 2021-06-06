package com.learning.design.patterns.structural.composite;

public class CompositePattern {

  public static void main(String[] args) {

    Tree treeOne = new Tree();
    treeOne.add(new Leaf("T1:L1"));
    treeOne.add(new Leaf("T1:L2"));
    treeOne.add(new Leaf("T1:L3"));

    Tree treeTwo = new Tree();
    treeTwo.add(new Leaf("T2:L1"));
    treeTwo.add(new Leaf("T2:L2"));
    treeTwo.add(new Leaf("T2:L3"));

    Tree tree = new Tree();
    tree.add(treeOne);
    tree.add(treeTwo);

    tree.print();
  }
}
