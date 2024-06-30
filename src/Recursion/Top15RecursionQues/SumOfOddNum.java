package Recursion.Top15RecursionQues;

public class SumOfOddNum {
    public static void main(String[] args) {
        int[] arr = {5,3,12,6,8,16};
        System.out.println(sum(arr, arr.length-1));
    }
    static int sum = 0;
    static int sum(int[] arr, int index){
        if (index == -1){
            return index;
        }
        if (arr[index]%2!=0) {
            sum += arr[index];
        }
        sum(arr, index-1);
        return sum;
    }
}
