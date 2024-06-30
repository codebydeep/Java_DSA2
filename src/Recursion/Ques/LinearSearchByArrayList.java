package Recursion.Ques;

import java.util.ArrayList;

public class LinearSearchByArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 8};
        int target = 4;
        ArrayList<Integer> ans = findAllIndex(arr, target, 0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(findAllIndex2(arr,target,0));
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

    // Optimized way of returning ArrayList by not storing list again & again.
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        // this will contain answer for that function call only.
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls = findAllIndex2(arr,target,index+1);
        list.addAll(ansfromBelowCalls);
        return list;
    }
}
