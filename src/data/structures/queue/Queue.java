package data.structures.queue;

public class Queue {

  private Node last;

  private Node first;

  private int size = 0;

  public void enqueue(String data){
    Node newNode = new Node(data);

    if (first == null && last == null){
      this.first = newNode;
    } else {
      this.last.setNext(newNode);
    }

    this.last = newNode;
    this.size++;
  }

  public void dequeue(){
    if (this.first != null || this.last != null){
      if (this.first != null){
        this.first = this.first.getNext();
        this.size--;
      } else {
        throw new RuntimeException("Empty Queue");
      }
    } else {
      throw new RuntimeException("Empty Queue");
    }
  }

  public String peek(){
    if (this.first != null || this.last != null) {
      if (this.first != null) {
        return this.first.getData();
      }
    }
    throw new RuntimeException("Empty Queue");
  }

  public int size(){
    return this.size;
  }

  public boolean isEmpty(){
    return this.first == null;
  }
}
