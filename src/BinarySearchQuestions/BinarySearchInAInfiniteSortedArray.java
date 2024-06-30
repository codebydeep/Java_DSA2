package BinarySearchQuestions;

public class BinarySearchInAInfiniteSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,4,5,8,11,13,15,17,19,22,24,25,34,37,39,44};
        int target = 4;
        System.out.println(ans(nums, target));
    }
    static int ans(int[] nums, int target){
        int s = 0;
        int e = 1;
        while (target > nums[e]){
            int temp = s+1;
            e = e + (e-s+1)*2;
            s = temp;
        }
        return bSearch(nums,target,s,e);
    }
    static int bSearch(int[] nums, int target, int start, int end){
        int temp = end+1;
        int nend = end + (end - start+1)*2;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
    return -1;
    }
}
