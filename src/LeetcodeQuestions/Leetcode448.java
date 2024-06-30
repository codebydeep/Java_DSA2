package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        //Arrays.sort(nums);
        for(int i=0;i<nums.length;){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else {
                i++;
            }
        }

        for(int i=0;i<nums.length;i++){
            int correct = i+1;
            if (nums[i] != correct) {
                list.add(correct);
            }
        }
        return list;
    }
}
