package Recursion.Ques;

import java.util.Scanner;

public class Leetcode2139 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();
         int maxDoubles = 0;
        System.out.println(minMoves(target,maxDoubles));
    }
    //static int i=1;
    static int minMoves(int target, int maxDoubles){
        return steps(5, target, 0);
    }
    static int steps(int n, int target, int cnt){
        if (n == target){
            return cnt;
        }

        if ((n%2 == 0)){
            if (n < target) {
                return steps(n * 2, target, cnt + 1);
            }
        }

        return steps(n+1,target,cnt+1);
    }
}
