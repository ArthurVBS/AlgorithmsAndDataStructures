package data.structures;

import data.structures.bubbleSort.BubbleSort;

import java.util.Random;

public class Start {

  public static void main(String[] args) {
    Random random = new Random();
    BubbleSort bubbleSort = new BubbleSort();

    final int SIZE = 10000;

    int[] arr = new int[SIZE];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(SIZE * 10);
    }

    long start = System.currentTimeMillis();

    bubbleSort.sort(arr);

    long end = System.currentTimeMillis();
    System.out.println(end - start);
  }
}
