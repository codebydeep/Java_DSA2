package Recursion.Top15RecursionQues.KunalQuestionsPractice;

public class GFGreverseString {
    public static void main(String[] args) {
        String S = "Geeks";
        System.out.println(reverse(S));
        String s1 = "Geeks";
        String s2 = "forGeeks";
        String s3 = s1 + s2;
        System.out.println(s3);
    }
    static String reverse(String s){
        String ns = "";
        int i=0;
         while (i < s.length()) {
             ns += s.charAt(i);
             i = i+2;
        }
         return ns;
    }
}
