package Array;

import java.util.*;

public class Permutations {
    public static void permutationSequence(int[] arr,ArrayList<Integer> list){
        if(arr.length==0){
            System.err.println(list);
            return;
        }

        int a = arr[0];
        for(int i=0;i<=list.size();i++){
            int 
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        permutationSequence(arr, list);
    }
}
