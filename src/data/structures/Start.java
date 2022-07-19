package data.structures;

import data.structures.queue.Queue;

public class Start {

  public static void main(String[] args) {
    Queue queue = new Queue();

    queue.enqueue("1");
    queue.enqueue("2");
    queue.enqueue("3");
    queue.enqueue("4");
    queue.enqueue("5");
    queue.enqueue("6");
    queue.enqueue("7");

    queue.dequeue();
    queue.dequeue();

    System.out.println("Size: " + queue.size());
    System.out.println("First: " + queue.peek());
    System.out.println("IsEmpty: " + queue.isEmpty());

  }
}
