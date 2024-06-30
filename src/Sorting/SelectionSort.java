package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,1, 2,3,4};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minEle = i;
            for (int j = i+1;j<= arr.length-1;j++) {
                if (minEle > arr[j]){
                    minEle = j;
                }
            }
            int temp = arr[minEle];
            arr[minEle] = arr[i];
            arr[i] = temp;
        }
       // System.out.println(arr);
    }
}
