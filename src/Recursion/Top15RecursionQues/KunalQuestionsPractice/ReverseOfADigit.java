package Recursion.Top15RecursionQues.KunalQuestionsPractice;

import java.util.Scanner;

public class ReverseOfADigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println(reverse(n));
    }
    static int ans = 0;
    static int reverse(int n){
        if (n == 0){
            return 0;
        }
        int rem = n%10;
        ans = ans*10 + rem;
        reverse(n/10);
        return ans;
    }
}
