package Bit_Manipulation;

public class SetBits2 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    static int setBits(int n){
        int count = 0;
        /*
        while (count > 0){
            count++;
            n -= (n & -n);
        }
         */

        while (n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
