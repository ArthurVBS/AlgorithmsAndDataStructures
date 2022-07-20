package data.structures;

import data.structures.insertionSort.InsertionSort;

import java.util.Random;

public class Start {

  public static void main(String[] args) {
    Random random = new Random();
    InsertionSort insertionSort = new InsertionSort();

    final int SIZE = 100000;

    int[] arr = new int[SIZE];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(SIZE * 10);
    }

    long start = System.currentTimeMillis();

    insertionSort.sort(arr);

    long end = System.currentTimeMillis();
    System.out.println(end - start);
  }
}
