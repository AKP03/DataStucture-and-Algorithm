package Array;

import java.util.Arrays;
import java.util.Stack;

public class RemoveElement {

    public static int remove(int[] arr, int val) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                stack.add(arr[i]);
            }
        }
        int temp = stack.size();

        for (int j = stack.size() - 1; j >= 0; j--) {
            arr[j] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));

        return temp;
    }

    public static void main(String[] args) {

        int arr[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        remove(arr, val);
    }
}
