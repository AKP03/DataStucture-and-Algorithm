package Array;

import java.util.*;

public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        // int i=0;
        stack.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            if (stack.peek() != nums[i]) {
                stack.add(nums[i]);
            }

        }
        for (int j = stack.size() - 1; j >= 0; j--) {
            nums[j] = stack.pop();
        }

        // System.out.println(stack.size());
        System.out.println(Arrays.toString(nums));
        return stack.size();

    }

    public static void main(String[] args) {
        // int[] arr = { 0, 1, 1, 2, 2, 3, 0, 4, 2 };
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        removeDuplicates(arr);
    }
}
