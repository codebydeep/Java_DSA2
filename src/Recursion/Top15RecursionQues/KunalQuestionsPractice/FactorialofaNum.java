package Recursion.Top15RecursionQues.KunalQuestionsPractice;

import java.util.Scanner;

public class FactorialofaNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = in.nextInt();
        System.out.println(fact(n));
        System.out.println(sum(n));
    }
    static int fact(int n){
        if (n <= 1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if (n <= 1) {
            return 1;
        }
        return n+sum(n-1);
    }
}
