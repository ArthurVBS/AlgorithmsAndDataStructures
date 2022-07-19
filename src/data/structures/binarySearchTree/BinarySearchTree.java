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
}
