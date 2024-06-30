package Recursion;

import java.util.Scanner;
public class Reversecount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        reverseprint(n);
    }
    static void reverseprint(int n){
        if (n<1){
            return ;
        }
        System.out.println(n);
        reverseprint(n-1);
    }
}
