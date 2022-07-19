package data.structures;

import data.structures.linkedList.LinkedList;

public class Start {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");
    list.add("6");

    list.remove(1);
    list.remove(4);

    System.out.print("Data: ");
    for (int i = 0; i < list.size(); i++){
      System.out.print(list.get(i) + ", ");
    }

    System.out.println("\nSize: " + list.size());

    System.out.println("Has: " + list.has("1"));
  }
}
