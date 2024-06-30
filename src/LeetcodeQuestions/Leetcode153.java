package LeetcodeQuestions;

public class Leetcode153 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums){
        if (nums.length == 1){
            return nums[nums.length-1];
        }
        int s=0;
        int e=nums.length-1;
        while (s <= e){
            int mid = s + (e - s)/2;
            if (nums[mid] > nums[e] ){
                if (nums[mid] > nums[mid+1]){
                    return nums[mid+1];
                }
                else {
                    s = mid+1;
                }
            }
            if (nums[mid] > nums[s]){
                if (nums[s] < nums[s+1]){
                    return nums[s];
                }
                else {
                    e = mid-1;
                }
            }
            if (nums[s] < nums[e]){
                return nums[s];
            }
        }
        return -1;
    }
}
