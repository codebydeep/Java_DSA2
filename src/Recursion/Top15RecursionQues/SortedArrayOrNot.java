package Recursion.Top15RecursionQues;

public class SortedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {2,4, 12, 15, 34};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }
        if (arr[index] > arr[index+1]){
            return false;
        }

        return isSorted(arr, index+1);
    }
}
