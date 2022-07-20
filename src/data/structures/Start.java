package data.structures;

import data.structures.selectionSort.SelectionSort;

import java.util.Random;

public class Start {

  public static void main(String[] args) {
    Random random = new Random();
    SelectionSort selectionSort = new SelectionSort();

    final int SIZE = 100000;

    int[] arr = new int[SIZE];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(SIZE * 10);
    }

    long start = System.currentTimeMillis();

    selectionSort.sort(arr);

    long end = System.currentTimeMillis();
    System.out.println(end - start);
  }
}
