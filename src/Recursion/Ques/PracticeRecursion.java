package Recursion.Ques;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int[] arr = {13, 5, 12, 7, 4, 47, 8};
        //ls(arr,1);
        //System.out.println(ans);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
    static void ls(int[] arr,int index){
        if (index==arr.length-1){
            return;
        }
        if (arr[index-1] > arr[index]){
            int temp = arr[index];
            arr[index] = arr[index-1];
            arr[index-1] = temp;
        }
         ls(arr, index+1);
        System.out.println(Arrays.toString(arr));
    }
     */
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr, 0 , last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMax(int[] arr, int start, int last){
        int max = start;
        for (int i = 0; i <= last; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}