package Recursion.Ques;

import java.util.Arrays;

public class SortingPractice {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        //bubbleSort(arr);
        //insertionSort(arr);
        //selectionSort(arr);
        //cyclicSort(arr);
        //mergeSort(0, arr.length, arr);
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    // Bubble Sort //
//    public static void bubbleSort(int[] arr){
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 1; j <= arr.length -i -1; j++) {
//                if (arr[j-1] > arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//    }
    // Insertion Sort //
//    public static void insertionSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (arr[j-1] > arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//    }
    // Selection Sort //
//    public static void selectionSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int last = arr.length-i-1;
//            int getMaxIndex = getIndex(0,last,arr);
//            swap(last,getMaxIndex, arr);
//        }
//    }
//    public static int getIndex(int start, int last , int[] arr){
//        int max = 0;
//        for (int i = start; i <= last; i++) {
//            if (arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }
//    static void swap(int first,int second, int[] arr){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
    // Cyclic Sort //
//    public static void cyclicSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int correct = arr[i] - 1;
//            if (arr[i] != arr[correct]){
//                int temp = arr[correct];
//                arr[correct] = arr[i];
//                arr[i] = temp;
//            }
//        }
//    }
//    public static void mergeSort(int s, int e, int[] arr){
//        if (e - s == 1){
//            return;
//        }
//        int mid = (s+e)/2;
//        mergeSort(s,mid,arr);
//        mergeSort(mid,e,arr);
//        mergeArrays(s,mid,e,arr);
//    }
//    public static int[] mergeArrays(int s, int mid, int e, int[] arr){
//        int[] mix = new int[e-s];
//
//        int i=s;
//        int j=mid;
//        int k=0;
//
//        while (i < mid && j < e){
//            if (arr[i] < arr[j]){
//                mix[k] = arr[i];
//                i++;
//            }
//            else {
//                mix[k] = arr[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < mid){
//            mix[k] = arr[i];
//            i++;
//            k++;
//        }
//        while (j < e){
//            mix[k] = arr[j];
//            j++;
//            k++;
//        }
//
//        for (int l = 0; l < mix.length; l++) {
//            arr[l+s] = mix[l];
//        }
//        return mix;
//    }
    // Quick Sort //
    public static void quickSort(int[] arr, int low, int hi){
        if (low > hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = (s+e)/2;
        int pivot = arr[m];

        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (pivot < arr[e]){
                e--;
            }

            if (arr[s] > arr[e]){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
            s++;
            e--;
            quickSort(arr,low,e);
            quickSort(arr,s,hi);
        }
    }
}
