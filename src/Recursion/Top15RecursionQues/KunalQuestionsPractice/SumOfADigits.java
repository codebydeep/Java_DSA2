package Recursion.Top15RecursionQues.KunalQuestionsPractice;

import java.util.Scanner;

public class SumOfADigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = in.nextInt();
        System.out.println(sum(n));
        System.out.println(product(n));
    }
    static int sum(int n){
        if (n == 0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
    static int product(int n){
        if (n%10 == n){
            return n;
        }
        return n%10 * product(n/10);
    }
}
