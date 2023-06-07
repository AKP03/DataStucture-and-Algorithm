package Array;

import java.util.Arrays;

public class TrappingRainwater {
    static int ans = 0;

    public static void tappingWater(int[] arr, int i, int count) {
        if (i == arr.length) {
            ans = count;
            return;
        }
        int leftmax = Integer.MIN_VALUE;
        int rightmax = Integer.MIN_VALUE;
        int min = 0;
        for (int a = 0; a <= i; a++) {
            if (arr[a] > leftmax) {
                leftmax = arr[a];
            }
        }
        for (int a = i; a < arr.length; a++) {
            if (arr[a] > rightmax) {
                rightmax = arr[a];
            }
        }

        min = Math.min(rightmax, leftmax);
        int result = min - arr[i];

        tappingWater(arr, i + 1, count + result);

    }

    public static void TappingWaterApproach2(int[] arr) {
        int[] leftmax = new int[arr.length];
        int[] rightmax = new int[arr.length];
        leftmax[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        rightmax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i > 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        // System.out.println(Arrays.toString(leftmax));
        // System.out.println(Arrays.toString(rightmax));
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = Math.min(leftmax[i], rightmax[i]);
            res = (min - arr[i]) + res;

        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        // int[] arr = { 4, 2, 0, 3, 2, 5 };

        // int i = 0;
        // int count = 0;
        // tappingWater(arr, i, count);

        // System.err.println(ans);

        TappingWaterApproach2(arr);
    }
}
