package Recursion.Top15RecursionQues.KunalQuestionsPractice;

import java.util.Scanner;

public class NoOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(steps(n,0));
    }
    static int steps(int n, int cnt){
        if (n == 0){
            return cnt;
        }
        if (n%2 != 0){
            n=n-1;
            return steps(n,cnt+1);
        }
        return steps(n/2,cnt+1);
    }
}
