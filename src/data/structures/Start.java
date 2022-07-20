package data.structures;

import data.structures.mergeSort.MergeSort;

import java.util.Random;

public class Start {

  public static void main(String[] args) {
    Random random = new Random();
    MergeSort mergeSort = new MergeSort();

    final int SIZE = 1000000;

    int[] arr = new int[SIZE];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(SIZE * 10);
    }

    long start = System.currentTimeMillis();

    mergeSort.sort(arr);

    long end = System.currentTimeMillis();
    System.out.println(end - start);
  }
}
