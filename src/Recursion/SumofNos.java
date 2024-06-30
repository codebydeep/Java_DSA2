package Recursion;

import java.util.Scanner;
public class SumofNos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = sum(n);
        System.out.println(ans);
    }
    static int sum(int n){
        if (n==0){
            return 0;
        }

        return n + sum(n-1);
    }
}
