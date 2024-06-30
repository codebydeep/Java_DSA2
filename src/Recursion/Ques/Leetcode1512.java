package Recursion.Ques;

public class Leetcode1512 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int ans = numOfGoodPairs(nums);
        System.out.println(ans);
    }
    static int numOfGoodPairs(int[] nums){
        int cnt=0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
