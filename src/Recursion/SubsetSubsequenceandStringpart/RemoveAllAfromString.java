package Recursion.SubsetSubsequenceandStringpart;

public class RemoveAllAfromString {
    public static void main(String[] args) {
        String s = "baccad";
        remove(s,0);
    }
    static void remove(String s, int index){
        if(index == s.length()){
            return ;
        }
        if (s.charAt(index) == 'a'){
            index = index+1;
        }
        System.out.print(s.charAt(index));
        remove(s, index+1);
    }
}
