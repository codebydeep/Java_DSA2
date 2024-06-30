package Bit_Manipulation;

public class XorOfNum {
    public static void main(String[] args) {
        int n = 5;
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans = ans ^ i;
            System.out.println(ans);
        }
    }
}
