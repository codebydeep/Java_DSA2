package Bit_Manipulation;

public class NthMagicNum {
    public static void main(String[] args) {
        int n = 6;
        int ans = magicNos(n);
        System.out.println(ans);
    }
    static int magicNos(int n){
        int ans = 0;
        int base = 5;
        while (n > 0){
            int lastdig = n & 1;
             n = n >> 1;
             ans += lastdig * base;
             base = base * 5;
        }
        return ans;
    }
}
