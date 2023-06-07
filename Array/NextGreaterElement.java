package Array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 13, 3, 8 };
        nextGreater(arr);
    }

    public static void nextGreater(int[] arr) {
        int[] arr2 = new int[arr.length];
        Arrays.fill(arr2, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                arr2[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(arr2));

    }
}
