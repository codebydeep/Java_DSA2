package Recursion.Top15RecursionQues.KunalQuestionsPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchOccurences {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,4,5,7};
        int target = 4;
        findAllIIndex(arr,target,0);
        System.out.println(list);

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return ;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIIndex(arr, target, index+1);
    }
}
