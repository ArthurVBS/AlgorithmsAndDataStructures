package data.structures.stack;

public class Stack {

  private Node top;
  private int size = 0;

  public void push(String data){
    if (this.top == null) {
      this.top = new Node(data);
    } else {
      Node nextNode = this.top;
      this.top = new Node(data, nextNode);
    }

    this.size++;
  }

  public void pop(){
    if (this.top == null){
      throw new RuntimeException("Empty Stack");
    } else {
      top = top.getNext();
      this.size--;
    }
  }

  public String peek() {
    if (this.top == null){
      throw new RuntimeException("Empty Stack");
    } else {
      return this.top.getData();
    }
  }

  public boolean isEmpty(){
    return this.top == null;
  }

  public int size(){
    return this.size;
  }


}
