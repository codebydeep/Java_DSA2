package Recursion.Ques;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = sum(n);
        System.out.println(ans);
    }
    static int sum(int n){
        if (n<=1){
            return 1;
        }
        return n + sum(n-1);
    }
}
