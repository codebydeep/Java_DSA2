package Recursion.Top15RecursionQues.KunalQuestionsPractice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 14, 17, 23, 39,45};
        int target = 39;
        System.out.println(bSearch(arr,target,0,arr.length-1));
    }
    static int bSearch(int[] arr, int target, int start, int end){
        int mid = start + (end - start)/2;
        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] > target){
            return bSearch(arr,target,start,mid-1);
        }
            return bSearch(arr, target, mid + 1, end);
    }
}
