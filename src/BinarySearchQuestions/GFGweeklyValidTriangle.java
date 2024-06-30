package BinarySearchQuestions;

import java.util.Scanner;

public class GFGweeklyValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(isPossible(a,b,c));
    }
    static String isPossible(int a, int b, int c) {
        // code here
       int s = (a+b+c)/2;
       double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
       if (area >= 0 && (c > a) && (c > b)){
           return "YES";
       }
       return "NO";
     }
}
