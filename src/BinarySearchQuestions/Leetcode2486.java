package BinarySearchQuestions;

public class Leetcode2486 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "zbc";
        System.out.println(appendCharacters(s, t));
    }
    public static int appendCharacters(String s, String t) {
        int cnt = 0;
        int i=0;
        int j=0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                    //s += t.charAt(j);
                    //cnt++;
                    j++;
            }
            //i++;
            i++;
        }
        return t.length() -  j;
    }
}
