package Recursion;

public class ConceptofPassingNumbers {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(--n);
      //  fun(n--); // Results in Stack Overflow.
      // n--  Vs --n
      /*
      n-- is pass the value of n first, and subtract.
      --n is subtract first, and is pass the value of n.
       */
    }
}
