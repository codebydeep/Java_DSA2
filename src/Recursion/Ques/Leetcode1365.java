package Recursion.Ques;

import java.util.Arrays;

public class Leetcode1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = answer(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] answer(int[] nums){
        int[] temp = new int[nums.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = lessthanit(nums,i);
        }
        return temp;
    }
    static int lessthanit(int[] nums, int less){
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[less] > nums[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}
