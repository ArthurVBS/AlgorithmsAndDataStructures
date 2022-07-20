package data.structures.bubbleSort;

public class BubbleSort {

  public void sort(int[] arr){
    if (arr != null && arr.length > 1) {
      boolean swaped;

      do {
        swaped = false;
        for (int i = 0; i < arr.length - 1; i++) {
          if (arr[i] > arr[i+1]) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            swaped = true;
          }
        }
      } while (swaped);
    }
  }
}
