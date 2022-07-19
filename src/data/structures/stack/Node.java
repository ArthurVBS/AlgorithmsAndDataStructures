package data.structures.stack;

public class Node {

  private String data;

  private Node next;

  public Node(String data){
    this.data = data;
  }

  public Node(String data, Node next) {
    this.data = data;
    this.next = next;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
