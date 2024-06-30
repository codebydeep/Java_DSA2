package Recursion.Top15RecursionQues.KunalQuestionsPractice;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        reverseprint(n);
        print(n);
    }
    static void reverseprint(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        reverseprint(n-1);
    }
    static void print(int n){
        if (n == 0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
