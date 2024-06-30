package LeetcodeQuestions;

import java.util.Arrays;

public class Leetcode268 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i<nums.length){
            int correct = i;
            if (nums[i] != correct){
                return correct;
             }
            i++;
        }
        return nums.length;
    }
}
