package Recursion.SubsetSubsequenceandStringpart;

public class StringSubsequenceWithASCII {
    public static void main(String[] args) {
        subSeqASCII("","abc");
    }
    static void subSeqASCII(String ans, String s){
        if (s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);

        subSeqASCII(ans + ch, s.substring(1));
        subSeqASCII(ans, s.substring(1));
        subSeqASCII(ans + (ch + 0), s.substring(1));
    }
}
