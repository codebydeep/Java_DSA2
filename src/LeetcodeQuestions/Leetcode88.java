package LeetcodeQuestions;

import java.util.Arrays;

public class Leetcode88 {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        int m = 3,n=3;
        merge(nums1,m,nums2,n);
        //System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while (i<m && j<n){
            if (nums1[i] < nums2[j]){
                ans[k] = nums1[i];
                i++;
            }
            if (nums1[i] > nums2[j]){
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < m){
            ans[k] = nums1[i];
            i++;k++;
        }
        while (j < n){
            ans[k] = nums2[j];
            j++;k++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
