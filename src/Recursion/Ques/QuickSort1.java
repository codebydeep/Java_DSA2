package Recursion.Ques;

import java.util.Arrays;

public class QuickSort1 {
    public static void main(String[] args) {
        int[] arr = {4,3,5,7,8};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    /*
    static void sort(int[] arr, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int mid = s + (e - s)/2;
        int pivot = arr[mid];

        while (s <= e){
            // Also a reason, why it is already sorted, it will not swap.
            while (arr[s] < pivot){
                s++;
            }
            while (pivot < arr[e]){
                e--;
            }
            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        // Now my Pivot is at correct index/position, Sort the two halves now.
        sort(arr, low, e);
        sort(arr, s, hi);
    }
     */
  static void sort(int[] arr, int low, int hi){
      if(low >= hi){
         return;
      }
      int s = low;
      int e = hi;
      int mid = s + (e - s)/2;
      int pivot = arr[mid];

      while (s <= e){
          while (arr[s] < pivot){
              s++;
          }
          while (pivot < arr[e]){
              e--;
          }
          if (s <= e){
              int temp = arr[s];
              arr[s] = arr[e];
              arr[e] = temp;
              s++;
              e--;
          }
      }
      sort(arr, low, e);
      sort(arr, s, hi);
  }

}


