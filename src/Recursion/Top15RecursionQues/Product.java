package Recursion.Top15RecursionQues;

public class Product {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1};
        System.out.println(prod(arr, arr.length-1));
    }
    static int product = 1;
    static int prod(int[] arr, int index){
        if (index == -1){
            return index;
        }
        product*=arr[index];
        prod(arr, index-1);
        return product;
    }
}
