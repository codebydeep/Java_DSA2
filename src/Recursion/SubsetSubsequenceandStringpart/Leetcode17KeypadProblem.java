package Recursion.SubsetSubsequenceandStringpart;

import Recursion.Array;

import java.util.ArrayList;
import java.util.List;

public class Leetcode17KeypadProblem {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padproblem("","12"));
        System.out.println(padcount("", "12"));
    }
    static void pad(String ans, String s){
        if (s.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit = s.charAt(0) - '0'; // this will convert '2' into 2.

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            pad(ans + ch, s.substring(1));
        }
    }

    static ArrayList<String> padproblem(String ans, String s){
        if (s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> anss = new ArrayList<>();

        int digit = s.charAt(0) - '0'; // this will convert '2' into 2.

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

            anss.addAll( padproblem(ans + ch, s.substring(1)));
        }
        return anss;
    }

    static int padcount(String ans, String s){
        if (s.isEmpty()){
            System.out.println(ans);
            return 1;
        }
        int digit = s.charAt(0) - '0'; // this will convert '2' into 2.
       int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);

           count = count + padcount(ans + ch, s.substring(1));
        }
        return count;
    }
}
