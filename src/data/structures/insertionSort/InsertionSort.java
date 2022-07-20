package data.structures.insertionSort;

public class InsertionSort {

  public void sort(int[] arr){
    if (arr != null && arr.length > 1) {
      for (int i = 1; i < arr.length; i++) {
        for (int j = i; (j > 0 && arr[j] < arr[j-1]); j--) {
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
      }
    }
  }
}
