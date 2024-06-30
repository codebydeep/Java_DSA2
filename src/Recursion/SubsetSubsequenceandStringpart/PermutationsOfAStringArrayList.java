package Recursion.SubsetSubsequenceandStringpart;

import java.util.ArrayList;

public class PermutationsOfAStringArrayList {
    public static void main(String[] args) {
       // permutationsList("","abc");
        ArrayList<String> ans = permutationsList("","abc");
        System.out.println(ans);
    }
    static ArrayList<String> permutationsList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        // local to this call.
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
