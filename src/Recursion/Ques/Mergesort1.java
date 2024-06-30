package Recursion.Ques;

import java.util.Arrays;

public class Mergesort1 {
    public static void main(String[] args) {
        int[] arr = {2,6,12,34,19,112};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    /*
    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;
        while(i< first.length && j< second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // It may be possible that, one of the Arrays is not finished;
        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
     */
    static void mergeSort(int[]arr,int s, int e){
        if (e-s== 1){
            return ;
        }
        int mid = arr.length/2;
        mergeSort(arr,0,mid);
        mergeSort(arr,mid,arr.length);

        merge(arr,s,mid,e);
    }
    static int[] merge(int[] arr,int s, int mid, int e){
        int[] mix = new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while (i< mid && j< e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i< mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j< e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l=0; l< mix.length;l++){
            mix[l] = arr[s+l];
        }
        return mix;
    }
}

