package Recursion.Top15RecursionQues.KunalQuestionsPractice;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int target = 8;
        System.out.println(rotatedbSearch(arr,target,0,arr.length-1));
    }
    static int rotatedbSearch(int[] arr, int target, int s, int e){
        int mid = s+(e-s)/2;
        if (s > e){
            return -1;
        }
        if (arr[mid] == target){
            return mid;
        }
        if (arr[s] <= arr[mid]){
            if (target >= arr[s] && target <=arr[mid]){
                return rotatedbSearch(arr, target, s,  mid-1);
            }
            else {
                return rotatedbSearch(arr, target, mid+1, e);
            }
        }
        if (target >= arr[mid] && target <= arr[e]){
            return rotatedbSearch(arr, target, mid+1, e);
        }
        else {
           return rotatedbSearch(arr, target, s,  mid-1);
        }
    }
}
