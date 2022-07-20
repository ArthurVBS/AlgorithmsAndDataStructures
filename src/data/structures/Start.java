package data.structures;

import data.structures.quickSort.QuickSort;

import java.util.Random;

public class Start {

  public static void main(String[] args) {
    Random random = new Random();
    QuickSort quickSort = new QuickSort();

    final int SIZE = 10000000;

    int[] arr = new int[SIZE];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(SIZE * 10);
    }

    long start = System.currentTimeMillis();

    quickSort.sort(arr);

    long end = System.currentTimeMillis();
    System.out.println(end - start);
  }
}
