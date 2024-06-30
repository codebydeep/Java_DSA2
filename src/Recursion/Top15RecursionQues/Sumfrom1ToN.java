package Recursion.Top15RecursionQues;

import java.util.Scanner;

public class Sumfrom1ToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = in.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
