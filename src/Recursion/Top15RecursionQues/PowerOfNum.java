package Recursion.Top15RecursionQues;

import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = in.nextInt();
        System.out.println("Enter its power: ");
        int p = in.nextInt();
        System.out.println(power(n,p));
    }
    static int power(int n, int p){
        if (p == 0){
            return 1;
        }
        return n * power(n,p-1);
    }
}
