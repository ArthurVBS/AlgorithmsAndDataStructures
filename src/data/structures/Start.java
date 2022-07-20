package data.structures;

import data.structures.openAddressingHashTable.OpenAddressingHashTable;

public class Start {

  public static void main(String[] args) {
    OpenAddressingHashTable hashTable = new OpenAddressingHashTable();

    final int numElements = 1000000;

    long startPutTable = System.currentTimeMillis();
    for (int i = 0; i < numElements; i++) {
      String string = String.valueOf(i);
      hashTable.put(string, string);
    }
    long endPutTable = System.currentTimeMillis();
    System.out.println("Time putting in the table: " + (endPutTable - startPutTable));

    long startSearchTable = System.currentTimeMillis();
    for (int i = 0; i < numElements; i++) {
      String string = String.valueOf(i);
      hashTable.get(string);
    }
    long endSearchTable = System.currentTimeMillis();
    System.out.println("Time searching in the table: " + (endSearchTable - startSearchTable));
  }
}
