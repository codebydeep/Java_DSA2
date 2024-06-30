package Recursion;
import java.util.Scanner;
public class RecursionRevision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number upto print : ");
        int n = in.nextInt();
        print(n);
        reverseprint(n);
    }
    static void reverseprint(int n){
        if (n<=1){
            return;
        }
        System.out.println(n);
         reverseprint(n-1);
    }
    static void print(int n){
        if (n==15){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
