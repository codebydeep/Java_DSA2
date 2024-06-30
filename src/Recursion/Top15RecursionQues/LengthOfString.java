package Recursion.Top15RecursionQues;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String or Word: ");
        String s = in.next();
        System.out.println(length(s.length()));
    }
    static int cnt=0;
    static int length(int size){
        if (size == 0){
            return 1;
        }

        length(size-1);
        cnt++;
        return cnt;
    }
}
