package BinarySearchQuestions;

import java.util.Arrays;

public class FirstandLastOccurence {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = firstAndlast(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] firstAndlast(int[] arr, int target){
        int[] ans = {-1,-1};
        int s = search(arr, target,true);
        int e = search(arr, target, false);
        ans[0] = s;
        ans[1] = e;
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans  = -1;
        int s = 0;
        int e = nums.length-1;
        while (s <= e){
            int m = s+(e-s)/2;
            if (nums[m] > target){
                e =m-1;
            }
            else if (target > nums[m]){
                s =m+1;
            }
            else {
                ans = m;
                if (findStartIndex) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }
}
