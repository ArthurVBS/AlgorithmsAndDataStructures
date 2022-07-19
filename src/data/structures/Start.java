package data.structures;

import data.structures.binarySearchTree.BinarySearchTree;

public class Start {

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();

    bst.add(27);
    bst.add(24);
    bst.add(14);
    bst.add(28);
    bst.add(3);
    bst.add(38);
    bst.add(9);
    bst.add(10);

    System.out.println(bst.contains(27));
  }
}
