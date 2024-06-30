package Bit_Manipulation;

public class SetBits {
    public static void main(String[] args) {
        int n = 5;
        int cnt = 0;
        while (n > 0){
            int last = n & 1;
            if (last == 1){
                cnt++;
            }
            n = n >> 1;
        }
        System.out.println(cnt);
    }
}
