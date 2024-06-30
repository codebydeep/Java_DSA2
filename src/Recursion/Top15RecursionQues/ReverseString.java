package Recursion.Top15RecursionQues;

public class ReverseString {
    public static void main(String[] args) {
        String s = "helloworld!";
        reverse(s);
    }
    static void reverse(String s) {
        if (s.length() == 0) {
            return;
        } else {
            System.out.print(s.charAt(s.length() - 1));
            reverse(s.substring(0, s.length() - 1));
        }
    }
}
