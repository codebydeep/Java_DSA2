package LeetcodeQuestions;

public class Leetcode414 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        int max = nums[0];
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < max) {
                max = nums[i];
                cnt++;
                if (cnt == 3) {
                    return max;
                }
            }
        }
        if (nums.length < 3){
            int min = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (min < nums[i]){
                    min = nums[i];
                }
            }
            return min;
        }
            return -1;
    }
}
