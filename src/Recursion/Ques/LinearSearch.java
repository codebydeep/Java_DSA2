package Recursion.Ques;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 13, 20, 24, 33, 47};
        int target = 33;
        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        System.out.println(findIndexLast(arr,target, arr.length-1));
        findAllIndex(arr,target,0);
        System.out.println(list);
    }
    static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
    static int findIndexLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return findIndexLast(arr, target, index-1);
    }

    // By using with the help of ArrayList
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return ;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

}
