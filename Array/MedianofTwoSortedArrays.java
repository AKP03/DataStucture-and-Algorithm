package Array;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

    public static boolean isOdd(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // int[] num1 = { 1, 2 };
        // int[] num2 = { 3, 4 };

        int[] num1 = { 1, 3 };
        int[] num2 = { 2 };

        int[] mix = new int[num1.length + num2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < num1.length && j < num2.length) {
            if (num1[i] > num2[j]) {
                mix[k] = num2[j];
                k++;
                j++;
            } else {
                mix[k] = num1[i];
                k++;
                i++;
            }
        }
        while (i < num1.length) {
            mix[k] = num1[i];
            k++;
            i++;
        }
        while (j < num2.length) {
            mix[k] = num2[j];
            j++;
            k++;
        }

        int size = mix.length;
        System.out.println(Arrays.toString(mix));
        if (!isOdd(size)) {
            int median = size / 2;

            float ans = (float) (mix[median] + mix[median - 1]) / 2;
            System.out.print(ans);
        } else {

            int ans = mix[size / 2];
            System.out.print(ans);
        }

    }
}
