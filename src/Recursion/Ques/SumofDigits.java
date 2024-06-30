package Recursion.Ques;
import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans1 = sum(n);
        int ans2 = prod(n);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    // Sum of digits of a number.
    static int sum(int n){
        if (n == 0){
            return 0;
        }
        return sum(n/10) + (n%10);
    }
    // Prod of digits of a number.
    static int prod(int n){
        if (n%10 == n){
            return n;
        }
        return prod(n/10) * (n%10);
    }
}
