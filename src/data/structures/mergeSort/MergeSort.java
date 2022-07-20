package data.structures.mergeSort;

public class MergeSort {

  public void sort(int[] arr){
    sortInternal(arr);
  }

  private static void sortInternal(int[] arr) {
    if (arr.length > 1) {
      int leftArraySize = arr.length/2;

      int[] leftArray = new int[leftArraySize];
      for (int i = 0; i < leftArray.length; i++) {
        leftArray[i] = arr[i];
      }

      int[] rightArray = new int[arr.length - leftArraySize];
      for (int i = 0; i < rightArray.length; i++) {
        rightArray[i] = arr[i + leftArraySize];
      }

      sortInternal(leftArray);
      sortInternal(rightArray);
      merge(leftArray, rightArray, arr);
    }
  }

  private static void merge(int[] leftArray, int[] rightArray, int[] arr) {
    int l = 0, r = 0;
    for (int i = 0; i < arr.length; i++) {
      if (l >= leftArray.length) {
        arr[i] = rightArray[r];
        r++;
      } else if (r >= rightArray.length) {
        arr[i] = leftArray[l];
        l++;
      } else if (leftArray[l] > rightArray[r]) {
        arr[i] = rightArray[r];
        r++;
      } else {
        arr[i] = leftArray[l];
        l++;
      }
    }
  }
}
