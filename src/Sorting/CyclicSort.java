package Sorting;

import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,3,1};
        sort(arr);
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i]-1;
            if (arr[i] != arr[current]){
                int temp = arr[current];
                arr[current] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
