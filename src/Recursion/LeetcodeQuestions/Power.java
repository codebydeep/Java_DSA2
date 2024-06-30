package Recursion.LeetcodeQuestions;

import java.util.Arrays;

public class Power {
    public static void main(String[] args) {
//        double x = 2.0000d;
//        int n = 10;
//        System.out.println(myPow(x,n));
//    }
//    public static double myPow(double x, int n){
//        if (n < 0){
//            return n;
//        }
//
//        double sum = Math.pow(x , n);
//        sum += myPow(x,n-1);
//
//        return sum;
//    }
        int[] arr = new int[]{2,4,7,1,3,8};
        // o/p = {2,1,4,3,7,8};
        // index={0,3,1,4,2,5};
        //shuffle(arr);
        int n = arr.length/2;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }
    public static int[] shuffle(int[] arr, int n){
        int[]ans = new int[2*n];
        int j = 0;
        for (int i = 0; i < arr.length; i+=2) {
            ans[i] = arr[j];
            ans[i+1] = arr[j+n];
            j++;
        }
        return ans;
    }
}
