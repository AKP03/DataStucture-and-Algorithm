package Array;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2 };
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        boolean flag = true;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                // return false;
                flag = false;
                System.out.println("false");
            }
        }

        // return true;
        if (flag)
            System.out.println("true");
    }
}
