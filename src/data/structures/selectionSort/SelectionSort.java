package data.structures.selectionSort;

public class SelectionSort {

  public void sort(int[] arr){
    if (arr != null && arr.length > 1) {
      for (int i = 0; i < arr.length; i++) {
        int less = i;

        for (int j = i; j < arr.length; j++) {
          if (arr[j] < arr[less]) {
            less = j;
          }
        }

        int temp = arr[less];
        arr[less] = arr[i];
        arr[i] = temp;
      }
    }
  }
}
