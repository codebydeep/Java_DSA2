package Recursion.Top15RecursionQues;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 3421;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if (n/10 == 0){
            return n;
        }
        return sum(n%10) + sum(n/10);
    }
}
