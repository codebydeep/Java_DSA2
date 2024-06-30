package Recursion.Ques;
import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(n);
    }
    static void print(int n){
        if (n==0){
            return;
        }
        print(n-1); // This function will be in Stack till n == 0,then it will be remove from the stack one by one.
        System.out.println(n); // After, removing from the Stack, it will be printing the values.
    }
}
