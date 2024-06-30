package Recursion;

public class Leetcode238 {
    public static void main(String[] args) {
        /*
        int [] arr = {1,2,3,4};
        // o/p = [24,12,8,6];
        productExceptSelf(arr);
         */
        String s = "Hello World";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }
    static int lengthOfLastWord(String s) {
        int cnt=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'z'){
                cnt++;
            }

            if (s.charAt(i) == ' '){
                break;
            }
        }
        return cnt;
    }
}
