package Recursion.Ques;

import java.util.Arrays;

public class Leetcode137 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        System.out.println(singleNum(nums));
    }
    static int singleNum(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = count(nums);
           if (nums[i] == 1){
               return i;
           }
        }

        return -1;
    }
    static int count(int[] nums){
        Arrays.sort(nums);
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            cnt++;
            if (nums[i] != nums[i+1]){
                cnt = 0;
            }
        }
        return cnt;
    }
}
