package Recursion.SubsetSubsequenceandStringpart;

public class RemoveWordFromString {
    public static void main(String[] args) {
        System.out.println(skipApple("baccappledah"));
        System.out.println(skipAppNotApple("baccappldah"));
    }
    static String skipApple(String s){
        if (s.isEmpty()){
            return "";
        }
        if (s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
    static String skipAppNotApple(String k){
        if (k.isEmpty()){
            return "";
        }
        if (k.startsWith("app") && !k.startsWith("apple")){
            return skipAppNotApple(k.substring(3));
        }
        else {
            return k.charAt(0) + skipAppNotApple(k.substring(1));
        }
    }
}
