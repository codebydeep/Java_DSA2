package BinarySearchQuestions;

public class PeakIndex {
    public static void main(String[] args) {
        int[] nums = {7,8,9,5,4,3,2};
        System.out.println(findIndex(nums));
    }
    static int findIndex(int[] nums){
        int s=0;
        int e=nums.length-1;
        while (s<e){
            int m = s+(e-s)/2;
            if (nums[m] > nums[m+1]){
                e = m;
            }
            else {
                s = m+1;
            }
        }
        return s;
    }
}
