package Array;

import java.util.Arrays;

public class reverseArray {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        // System.out.println("swap");
    }

    public static void rotate(int[] arr, int k) {
        int s = 0;
        int e = arr.length;
        while (s < e) {
            swap(arr, s, e - 1);
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
        k %= arr.length;
        int i = 0;
        int w = k;
        while (i < k) {
            swap(arr, i, k - 1);
            i++;
            k--;
        }
        System.out.println(Arrays.toString(arr));
        int r = arr.length;
        while (w < r) {
            swap(arr, w, r - 1);
            w++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int[] arr11 = { -1, -6, -7, 8 };
        int k = 3;
        System.out.println(Arrays.toString(arr));
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
