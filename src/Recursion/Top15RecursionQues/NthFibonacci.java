package Recursion.Top15RecursionQues;

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = in.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if (n < 2){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
