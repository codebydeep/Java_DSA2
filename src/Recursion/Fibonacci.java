package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            System.out.println(fibo(i));
        }
    }
    static int fibo(int n){
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
