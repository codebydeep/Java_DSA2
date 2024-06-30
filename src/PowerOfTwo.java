import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(powerofTwo(n));
    }
    static boolean powerofTwo(int n){
        if (n == 0){
            return true;
        }
        if (n % 2 != 0){
            return false;
        }
         return powerofTwo(n/2);
         //return false;
    }
}