package Array;

import java.util.Arrays;

public class mergeSortedArray2 {

    public static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                nums1[i] = 0;
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                nums2[j] = 0;
                j--;
                k--;
            }
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        // int[] nums1 = { 1 };
        // int m = 1;
        // int[] nums2 = {};
        // int n = 0;

        // int[] nums1 = { 4, 5, 6, 0, 0, 0 };
        // int m = 3;
        // int[] nums2 = { 1, 2, 3 };
        // int n = 3;

        // int[] nums1 = { 0 };
        // int m = 0;
        // int[] nums2 = { 1 };
        // int n = 1;

        mergeArray(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
