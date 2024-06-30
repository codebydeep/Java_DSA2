package Recursion.Top15RecursionQues;

import java.util.Scanner;

public class FactofaNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number whose factorial to be found: ");
        int n = in.nextInt();
        System.out.println(fact(n));
    }
    static int fact(int n){
        if (n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
}
