package BinarySearchQuestions;

import java.util.Arrays;

public class RemovesDuplicateFromAString {
    public static void main(String[] args) {
        String s = "abbbcc";
        System.out.println(removeDuplicates(s));

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
