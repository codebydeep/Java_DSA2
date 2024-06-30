package Recursion.SubsetSubsequenceandStringpart;

import java.util.ArrayList;

public class StringSubsequenceArrayList {
    public static void main(String[] args) {
        System.out.println(subSeq("","abc"));
    }
    static ArrayList<String> subSeq(String ans, String s){
        if (s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = s.charAt(0);

        ArrayList<String> left = subSeq(ans+ch, s.substring(1));
        ArrayList<String> right = subSeq(ans,s.substring(1));

        left.addAll(right);
        return left;
    }
}
