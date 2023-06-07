package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SumOf3 {

    public static List<List<Integer>> TotalSum(int[] arr, List<List<Integer>> outer, List<Integer> internal, int sum) {
        if (internal.size() == 3) {
            if (sum == 0) {
                List<Integer> list = new ArrayList<>();
                list.addAll(internal);
                outer.add(internal);
                return outer;
            }
            return outer;
        }

        if (sum >= 0) {
            internal.add(arr[0]);
            TotalSum(Arrays.copyOfRange(arr, 1, arr.length), outer, internal, sum);
            internal.remove(internal.size() - 1);
        }
        TotalSum(Arrays.copyOfRange(arr, 1, arr.length), outer, internal, sum);

        return outer;

    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        // int[] arr = {0,1,1};
        // int[] arr = {0,0,0};

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int sum = 0;
        List<List<Integer>> list3 = TotalSum(arr, list, list2, sum);
        System.out.println(list3);
    }
}
