package data.structures.linkedList;

public class LinkedList {

  private Node head;
  private Node tail;
  private int size;

  public void add(String data){
    Node newNode = new Node(data);

    if (head == null && tail == null){
      this.head = newNode;
    } else {
      this.tail.setNext(newNode);
    }

    this.tail = newNode;
    this.size++;
  }

  public String get(int pos){
    Node foundNode = null;
    int i = 0;

    for (Node currentNode = this.head; currentNode != null; currentNode = currentNode.getNext()){
      if (pos == i){
        foundNode = currentNode;
        break;
      }

      i++;
    }

    return foundNode == null ? null : foundNode.getData();
  }

  public void remove(int pos){
    if (pos == 0){
      this.head = this.head.getNext();
      this.size--;
    } else {
      Node previousNode = this.head;

      for (int j = 1; j < size; j++){
        Node currentNode = previousNode.getNext();

        if (pos == j) {
          previousNode.setNext(currentNode.getNext());
          this.size--;
          break;
        }

        previousNode = previousNode.getNext();
      }
    }
  }

  public boolean has(String data){
    boolean hasData = false;
    Node currNode = head;

    for (int i = 0; i < this.size; i++){
      if (data == currNode.getData()){
        hasData = true;
        break;
      }

      currNode = currNode.getNext();
    }

    return hasData;
  }

  public int size() {
    return this.size;
  }
}
