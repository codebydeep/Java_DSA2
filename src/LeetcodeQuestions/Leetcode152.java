package LeetcodeQuestions;

public class Leetcode152 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,0,-1};
        //maxProduct(nums);
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums){
        int maxProd = Integer.MIN_VALUE;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = start; j < nums.length; j++) {
                int end = j;
                prod = 1;
                for (int k = start; k <= end; k++) {
                    //System.out.print("[" + nums[k] + "]");
                    prod *= nums[k];
                }
                if (maxProd < prod){
                    maxProd = prod;
                }
                //System.out.println();
            }
        }
        //System.out.println(maxProd);
        return maxProd;
    }
}
