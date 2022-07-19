package data.structures;

import data.structures.stack.Stack;

public class Start {

  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push("10");
    stack.push("20");
    stack.push("30");
    stack.push("40");
    stack.push("50");
    stack.push("60");
    stack.push("70");

    stack.pop();

    System.out.println("Top: " + stack.peek());
    System.out.println("Size: " + stack.size());
    System.out.println("IsEmpty: " + stack.isEmpty());
  }
}
