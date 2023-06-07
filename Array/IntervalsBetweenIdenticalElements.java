package Array;

import java.util.ArrayList;

public class IntervalsBetweenIdenticalElements {

    public static ArrayList<Integer> optimizeProblem(int[] arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();

    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 1, 2, 3, 3 };

        // int[] arr = { 10, 5, 10, 10 };
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    sum = sum + Math.abs(i - j);

                }

            }
            list.add(sum);
        }
        System.out.println(list);

        ArrayList<Integer> newList = optimizeProblem(arr);
        System.out.println(newList);

    }
}
