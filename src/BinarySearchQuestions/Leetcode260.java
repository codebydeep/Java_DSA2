package BinarySearchQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode260 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] ans = singleNumber(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for (
                int i = 0; i < nums.length; i++) {
           //nums[i] = frequency(nums[i],nums);
           if (frequency(nums[i],nums) == 1){
               list.add(nums[i]);
           }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
    static int frequency(int n, int[] nums){
        int cnt=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n){
                cnt++;
            }
        }
        return cnt;
    }
}
