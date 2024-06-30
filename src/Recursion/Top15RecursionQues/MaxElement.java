package Recursion.Top15RecursionQues;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {5,3,12,16,9};
        System.out.println(maxEle(arr,0,arr.length-1));
    }
    static int max = 0;
    static int maxEle(int[] arr, int start, int end){
        if (start == end){
            return arr[end];
        }

        if (arr[start] > arr[end]){
            max = arr[start];
        }
        maxEle(arr,start+1, end-1);
        return max;
    }
}
