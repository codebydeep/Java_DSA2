package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        // nums1 = [4,9,5], nums2 = [9,4,9,8,4];
        System.out.println((intersection(nums1,nums2)));
    }
    public static ArrayList<Integer> intersection(int[] nums1, int[] nums2){
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;

        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j] ){
                ans.add(nums1[i]);
            }
            i++;
            j++;
        }
        return ans;
    }
}
