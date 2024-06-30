package Recursion.Top15RecursionQues.KunalQuestionsPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target){
        ArrayList<Integer> list = occurences(nums,target,0);
        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
    static ArrayList<Integer> occurences(int[] nums, int target, int index){
       ArrayList<Integer> nlist = new ArrayList<>();
        if (index == nums.length){
            return nlist;
        }
        if (nums[index] == target){
            nlist.add(index);
        }
        ArrayList<Integer> ansfromBelow =  occurences(nums, target, index+1);
        nlist.addAll(ansfromBelow);
        return nlist;
    }
}
