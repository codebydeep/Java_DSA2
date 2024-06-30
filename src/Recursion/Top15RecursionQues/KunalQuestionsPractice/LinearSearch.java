package Recursion.Top15RecursionQues.KunalQuestionsPractice;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,3,7,13,12,9,8};
        int target = 12;
        System.out.println(search(arr,0,target));
        System.out.println(isPresent(arr,0,target));
    }
    static int search(int[] arr, int index, int target){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return search(arr, index+1, target);
    }
    static boolean isPresent(int[] arr, int index, int target){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || isPresent(arr, index+1, target);
    }
}
