package BinarySearchQuestions;

public class GFGpotd {
    public static void main(String[] args) {
        String s = "nobitaa";
        System.out.println(oddEven(s));
    }
    static String oddEven(String s){
        String ns = removeDuplicates(s);
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((frequency(s.charAt(i),s) %2 != 0) && i%2!=0){
                //x += 1;
                y += 1;
            }
             if ((frequency(s.charAt(i),s) %2 == 0) && i%2==0){
                x += 1;
                //y += 0;
            }

        }
        if ((x+y) %2 == 0){
            return "EVEN";
        }

           return "ODD";

    }
    static int frequency(char ch, String s){
        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
