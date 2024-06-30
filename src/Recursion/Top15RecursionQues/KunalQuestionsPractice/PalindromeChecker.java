package Recursion.Top15RecursionQues.KunalQuestionsPractice;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String s = in.next();
        System.out.println(isPalindrome(s, 0, s.length()-1));
    }
    static boolean isPalindrome(String s, int start, int end){
        if (start >= end){
            return true;
        }
        if (s.charAt(start) != s.charAt(end)){
            return false;
        }
        return isPalindrome(s,start+1,end-1);
    }
}
