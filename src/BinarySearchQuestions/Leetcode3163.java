package BinarySearchQuestions;

public class Leetcode3163 {
    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        System.out.println(compressedString(word));
    }
    static String compressedString(String word) {
        String ans = "";
        for (int i = 0; i < word.length(); i++) {
            ans += (freq(word.charAt(i),word) );
            ans += word.charAt(i);
        }
        return ans;
    }
    static int freq(char ch, String word){
        int cnt=0;
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)){
                cnt++;
            }
        }
        int fcnt = 0;
        if (cnt > 9){
            while(cnt != 0) {
                int rem = cnt % 10;
                fcnt += rem;
                cnt = cnt / 10;
            }
            return fcnt;
        }

        return cnt;
    }
}
