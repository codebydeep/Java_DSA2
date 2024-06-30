package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 14, 23, 34};
        int target = 34;
        int ans = search(arr, target, 0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int start , int end){
        int mid = start + (end - start)/2;
        if (start > end){
            return -1;
        }
        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] > target){
            return search(arr, target, start , mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}
