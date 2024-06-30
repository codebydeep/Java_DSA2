package Recursion.Ques;

public class SortedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 24, 46};
        System.out.println(sorted(arr, 0));
    }
    static boolean sorted(int[] arr, int index){
        if (index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
}
