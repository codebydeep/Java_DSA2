package Recursion.Top15RecursionQues;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(gcd(n1,n2));
        System.out.println(gcdRecursive(n1,n2));
    }
    static int gcd(int a, int b){
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a%i == 0 &&  b%i == 0){
               gcd = i;
            }
        }
        return gcd;

    }
    static int gcdRecursive(int a, int b){


        if (b == 0){
            return a;
        }
        else {
            return gcdRecursive(b, a % b);
        }
    }
}
