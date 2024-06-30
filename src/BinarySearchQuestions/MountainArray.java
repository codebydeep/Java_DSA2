package BinarySearchQuestions;

public class MountainArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,2,1};//{1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(nums,target));
    }
    static int search(int[] MountainArray, int target){
        int s = findIndex(MountainArray, target, true);
        return s;
    }
    static int findIndex(int[] nums, int target, boolean findIndex){
        int ans = -1;
        int s=0;
        int e=nums.length-1;
        while (s<=e){
            int m = s+(e-s)/2;
            if (nums[m] < target){
                s =m+1;
            }
            else if (target < nums[m]){
                e =m-1;
            }
            else {
                ans = m;
                if (findIndex){
                    e = m-1;
                }
                else {
                    s = m+1;
                }
            }
        }
        return ans;
    }
}
