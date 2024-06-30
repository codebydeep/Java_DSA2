package Recursion.Top15RecursionQues;

public class StringPalindrome {
    public static void main(String[] args) {
        String a  = "baba";
        System.out.println(isPalindrome(a,0,a.length()-1));
    }
    static boolean isPalindrome(String str, int s, int e){
        if (s == e){
            return true;
        }
        if (str.charAt(s) != str.charAt(e)){
            return false;
        }
        if (s < e + 1) {
            return isPalindrome(str, s + 1, e - 1);
        }
        return isPalindrome(str,s+1, e-1);
    }
}
