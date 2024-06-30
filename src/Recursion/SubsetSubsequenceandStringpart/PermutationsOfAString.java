package Recursion.SubsetSubsequenceandStringpart;

public class PermutationsOfAString {
    public static void main(String[] args) {
        permutations("", "abc");
        System.out.println(permutationsCount("", "abc"));
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    // Function for Count the number of Permutations of a String.
    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            //System.out.println(p);
            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
