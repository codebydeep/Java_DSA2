package Recursion.SubsetSubsequenceandStringpart;

public class StringSubsequence {
    public static void main(String[] args) {
        subSeq1("","abc");
        subSeq2("","abc");
    }
    static void subSeq1(String ans, String s){
        if (s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        subSeq1(ans + ch,s.substring(1));
        subSeq1(ans, s.substring(1));
    }
    static void subSeq2(String ans, String s){
        if (s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        subSeq2(ans, s.substring(1));
        subSeq2(ans + ch,s.substring(1));

    }
}
