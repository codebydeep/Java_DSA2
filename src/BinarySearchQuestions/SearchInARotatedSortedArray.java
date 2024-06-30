package BinarySearchQuestions;

public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(bSearch(arr,target,0,arr.length-1));
    }
    static int bSearch(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int m = start + (end - start)/2;
        if (arr[m] == target){
            return m;
        }
        if (arr[start] <= arr[m]){
            if (target <= arr[m] && target >= arr[start]){
                //end = m-1;
                return bSearch(arr, target, start, m-1);
            }
            else {
                //start = m+1;
                return bSearch(arr, target, m+1, end);
            }
        }
        if (target >= arr[m] && target <= arr[end]){
            //start = m+1;
            return bSearch(arr, target, m+1, end);
        }
            //end = m-1;
            return bSearch(arr, target, start, m-1);
    }
}
