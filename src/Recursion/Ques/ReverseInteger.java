package Recursion.Ques;
import java.util.Scanner;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /*
        reversenos(n);
        System.out.println(sum);
         */
        System.out.println(reversenos2(8762));
    }
    // Approach 1 :
    static int sum = 0;
    static void reversenos(int n){
        if (n == 0){
            return ;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        reversenos(n/10);
    }

    // Approach 2 :

    static int reversenos2(int n){
        // Sometimes you might need some additional variables in the argument.
        // In that case, make another function.
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    public static int helper(int n, int digits){
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
