package BinarySearchQuestions;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceiling(arr,target));
        System.out.println(floor(arr,target));
    }
    static int ceiling(int[] arr, int target){
        // Ceiling --> Smallest number greater than equal to Target.

        // But What, If the Target is greater than the greater number in the Array.
        if (target > arr[arr.length-1]){
            return -1;
        }
        int s = 0;
        int e = arr.length-1;
        while (s <= e){
            int m = s+(e-s)/2;
            if (arr[m] == target){
                return m;
            }
            if (arr[m] < target){
                s = m+1;
            }
            else {
                e = m - 1;
            }
        }
        return s;
    }
    static int floor(int[] arr, int target){
        // Floor --> Greater number lesser than equal to Target.
        int s = 0;
        int e = arr.length-1;
        while (s <= e){
            int m = s+(e-s)/2;
            if (arr[m] == target){
                return m;
            }
            if (arr[m] < target){
                s = m+1;
            }
            else {
                e = m - 1;
            }
        }
        return e;
    }
}
