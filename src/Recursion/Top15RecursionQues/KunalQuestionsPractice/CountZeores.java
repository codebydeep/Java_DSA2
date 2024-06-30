package Recursion.Top15RecursionQues.KunalQuestionsPractice;

import java.util.Scanner;

public class CountZeores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    static int cnt = 0;
    static int count(int n){
        if (n/10 == 0){
            return n;
        }
        int rem = n%10;
        if (rem == 0){
            cnt++;
        }
        count(n/10);
        return cnt;
    }
    /*
    static int count(int n){
        return helper(n,0);
    }
    private static int helper(int n, int c){
        if (n == 0){
            return c;
        }
        int rem = n%10;
        if (rem == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
     */
}
