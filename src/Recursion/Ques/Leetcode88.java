package Recursion.Ques;

public class Leetcode88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mix = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
            }
            else{
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < nums1.length){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            mix[k] = nums2[j];
            j++;
            k++;
        }
        for(int l=0; l<mix.length; l++){
            nums1[l] = mix[l];
        }
    }
}
