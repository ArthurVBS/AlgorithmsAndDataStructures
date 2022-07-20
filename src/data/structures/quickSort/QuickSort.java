package data.structures.quickSort;

public class QuickSort {

  public void sort(int[] arr){
    if (arr.length > 1) {
      internalSort(arr, 0, arr.length - 1);
    }
  }

  private static void internalSort(int[] arr, int first, int last){
    if (last - first > 0){
      int pivotIndex = partition(arr, first, last);
      internalSort(arr, first, pivotIndex - 1);
      internalSort(arr, pivotIndex + 1, last);
    }
  }

  private static int partition(int[] arr, int first, int last) {
    int up = first;
    int down = last;
    int pivot = arr[first];

    while(down > up) {
      while(up <= last && arr[up] <= pivot) {
        up++;
      }

      while(arr[down] > pivot) {
        down--;
      }

      if (down > up) {
        int temp = arr[up];
        arr[up] = arr[down];
        arr[down] = temp;
      }
    }

    arr[first] = arr[down];
    arr[down] = pivot;
    return down;
  }

}
