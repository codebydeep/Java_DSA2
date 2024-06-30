package Recursion.SubsetSubsequenceandStringpart;

public class RemoveCharFromString {
    public static void main(String[] args) {
        skip("", "baccadh");
        System.out.println(skip("baccadh"));
    }
    // Approach 1 --> By using answer String as argument.
    static void skip(String ans, String s){
        if (s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        if (ch == 'a'){
            skip(ans, s.substring(1));
        }
        else {
            skip(ans + ch, s.substring( 1));
        }
    }
    // Approach 2 --> By using answer String in function body.
    static String skip(String s){
        if (s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if (ch == 'a'){
            return skip(s.substring(1));
        }
        else {
            return ch + skip(s.substring(1));
        }
    }
}
