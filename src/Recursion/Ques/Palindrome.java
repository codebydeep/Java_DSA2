package Recursion.Ques;

public class Palindrome {
    public static void main(String[] args) {
       rev(1221);
       palin(1221);
    }
    static boolean palin(int n){
        return n == sum;
    }
    static int sum = 0;
    static void rev(int n){
        if (n == 0){
            return ;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        rev(n/10);
    }
}
