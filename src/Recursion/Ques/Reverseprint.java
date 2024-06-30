package Recursion.Ques;
import java.util.Scanner;
public class Reverseprint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);
    }
    static void print(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        print(n-1); // Here, this will be in Stack memory, one by one calls the function.
    }
}
