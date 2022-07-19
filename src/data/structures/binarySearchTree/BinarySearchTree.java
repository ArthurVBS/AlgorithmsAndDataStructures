package data.structures.binarySearchTree;

public class BinarySearchTree {

  private Node root;

  public void add(int data) {
    if(root == null){
      this.root = new Node(data);
    } else {
      addInternal(data, this.root);
    }
  }

  private void addInternal(int data, Node node){
    if (data < node.getData()){
      if (node.getLeft() == null){
        node.setLeft(new Node(data));
      } else {
        addInternal(data, node.getLeft());
      }
    } else if (data > node.getData()) {
      if (node.getRight() == null){
        node.setRight(new Node(data));
      } else {
        addInternal(data, node.getRight());
      }
    }
  }

  public void remove(int data){
    removeInternal(data, this.root);
  }

  private Node removeInternal(int data, Node node) {
    if (node == null){
      return null;
    } else if (data == node.getData()) {
      if (node.getLeft() == null && node.getRight() == null){
        return null;
      } else if (node.getLeft() == null || node.getRight() == null) {
        if (node.getLeft() != null){
          return node.getLeft();
        } else {
          return node.getRight();
        }
      } else {
        Node largestPredecessor = node.getLeft();

        while (largestPredecessor.getRight() != null) {
          largestPredecessor = largestPredecessor.getRight();
        }

        node.setData(largestPredecessor.getData());
        node.setLeft(removeInternal(largestPredecessor.getData(), node.getLeft()));
        return node;
      }
    } else if (data < node.getData()) {
      node.setLeft(removeInternal(data, node.getLeft()));
      return node;
    } else {
      node.setRight(removeInternal(data, node.getRight()));
      return node;
    }
  }

  public boolean contains(int data){
    boolean toReturn = false;

    if (this.root != null){
      toReturn = containsInternal(data, this.root);
    }

    return toReturn;
  }

  private boolean containsInternal(int data, Node node){
    if (node == null){
      return false;
    } else {
      if (data == node.getData()){
        return true;
      } else if (data < node.getData()){
        return containsInternal(data, node.getLeft());
      } else {
        return containsInternal(data, node.getRight());
      }
    }
  }

  public void traversePreOrder() {
    traversePreOrderInternal(this.root);
  }

  private void traversePreOrderInternal(Node node) {
    if (node != null) {
      System.out.print(node.getData() + ", ");
      traversePreOrderInternal(node.getLeft());
      traversePreOrderInternal(node.getRight());
    }
  }
  public void traverseInOrder() {
    traverseInOrderInternal(this.root);
  }

  private void traverseInOrderInternal(Node node) {
    if (node != null) {
      traverseInOrderInternal(node.getLeft());
      System.out.print(node.getData() + ", ");
      traverseInOrderInternal(node.getRight());
    }
  }

  public void traversePostOrder() {
    traversePostOrderInternal(this.root);
  }

  private void traversePostOrderInternal(Node node) {
    if (node != null) {
      traversePostOrderInternal(node.getLeft());
      traversePostOrderInternal(node.getRight());
      System.out.print(node.getData() + ", ");
    }
  }

  public boolean isEmpty(){
    return this.root == null;
  }

}
