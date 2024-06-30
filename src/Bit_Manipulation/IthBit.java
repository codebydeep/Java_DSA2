package Bit_Manipulation;

import java.util.Arrays;

public class IthBit {
    public static void main(String[] args) {
       int[] digits = {1,2,3};
       int[] ans = plusOne(digits);
        System.out.println(Arrays.toString(ans));
    }
    static int[] plusOne(int[] digits) {
        int[] temp = new int[digits.length];
        for(int i=0; i<digits.length; i++){
            temp[i] = digits[i];
            if(i == digits.length-1){
                temp[i] = digits[i] + 1;
            }
        }
        return temp;
    }
}
