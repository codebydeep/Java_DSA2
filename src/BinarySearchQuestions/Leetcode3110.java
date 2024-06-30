package BinarySearchQuestions;

public class Leetcode3110 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOFAString(s));
    }
    static int scoreOFAString(String s){
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            score += Math.abs((int)s.charAt(i-1) - (int)s.charAt(i));
        }
        return score;
    }
}
