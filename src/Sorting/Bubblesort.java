package Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[]arr = {7,22, 45, 64,2};
        sort(arr);
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]){
                    swaps(arr,j-1, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swaps(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
