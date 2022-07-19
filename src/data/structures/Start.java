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

    bst.remove(27);
    bst.remove(14);
    bst.remove(10);

    System.out.println("IsEmpty: " + bst.isEmpty());

    System.out.println("Contains '3'? " + bst.contains(3));
    System.out.println("Contains '20'? " + bst.contains(20));
    System.out.println("Contains '38'? " + bst.contains(38));

    System.out.print("\nTraverse PreOrder: ");
    bst.traversePreOrder();

    System.out.print("\nTraverse InOrder: ");
    bst.traverseInOrder();

    System.out.print("\nTraverse PostOrder: ");
    bst.traversePostOrder();
  }
}
