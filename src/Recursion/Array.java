package Recursion;

public class Array {
    public static void main(String[] args) {
        int[] arr = {4, 7, 8, 3, 5};
        int size = args.length-1;
        print(arr,size);
    }
    static void print(int[] arr, int size){
        if (size==0){
            return ;
        }
        System.out.println(arr[size]);
        print(arr,size-1);

    }
}
