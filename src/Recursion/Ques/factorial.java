package Recursion.Ques;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if (n<=1){
            return 1;
        }
        return n * fact(n-1);
    }
}
