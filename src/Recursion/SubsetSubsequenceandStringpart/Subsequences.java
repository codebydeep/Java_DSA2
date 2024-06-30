package Recursion.SubsetSubsequenceandStringpart;

public class Subsequences {
    public static void main(String[] args) {
        String s = "bccaadd";
        String k = "bccappleadd";
        String m = "abc";
        remove("",s);
        System.out.println(remove(s));
        System.out.println(removeApp(k));
        System.out.println(removeApple(k));
        subSeq("",m);
    }
    // Remove a particular character from a String.
    static void remove(String ans, String s){
        if (s.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char ch = s.charAt(0);
        if (ch == 'a'){
            remove(ans, s.substring(1));
        }
        else {
            remove(ans + ch, s.substring(1));
        }
    }
    static String remove(String s){
        if (s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if (ch == 'a'){
            return remove(s.substring(1));
        }
        else {
            return ch + remove(s.substring(1));
        }
    }
    static String removeApp(String k){
        if (k.isEmpty()){
            return "";
        }
        char ch = k.charAt(0);
        if (k.startsWith("app")){
            return removeApp(k.substring(5));
        }
        else {
            return ch + removeApp(k.substring(1));
        }
    }

    static String removeApple(String k){
        if (k.isEmpty()){
            return "";
        }
        char ch = k.charAt(0);
        if (k.startsWith("app")){
            return removeApple(k.substring(3));
        }
        else {
            return ch + removeApple(k.substring(1));
        }
    }
    static void subSeq(String ans, String m){
        if (m.isEmpty()){
            System.out.println("[" + ans + "]");
            return;
        }
        char ch = m.charAt(0);
        subSeq(ans + ch, m.substring(1));
        subSeq(ans, m.substring(1));
        //subSeq(ans + (ch+0), m.substring(1));
    }
}
