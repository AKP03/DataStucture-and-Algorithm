package Array;

import java.util.Arrays;

public class MinimumSizeSubarraySum {

    public static int minimumArray(int[] nums, int target) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for (j = 0; j < nums.length; j++) {
            sum = sum + nums[j];
            if (sum >= target) {
                while (sum >= target) {
                    sum = sum - nums[i];
                    i++;
                }
                ans = Math.min(ans, j - i + 2);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }

    public static void main(String[] args) {
        // int[] nums = { 2, 3, 1, 2, 4, 3 };
        // int target = 7;
        int[] nums = { 1, 2, 3, 4, 5 };
        int target = 11;
        // int[] nums = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        // int target = 11;
        // int[] nums = { 1, 4, 4 };
        // int target = 4;
        System.out.println(Arrays.toString(nums));
        // int i = 0;
        int ans = minimumArray(nums, target);
        System.out.println(ans);
        // int j = 0;
        // int sum = 0;
        // int size = nums.length;
        // boolean flag = false;
        // while (j < nums.length) {
        // // System.out.println(sum);

        // sum = sum + nums[j];

        // if (sum < target) {
        // j++;
        // } else if (sum > target) {
        // sum = sum - nums[i];
        // if (target == sum) {
        // i++;
        // int k = j - i + 1;
        // size = Math.min(size, k);
        // flag = true;
        // // System.out.println("size" + size);
        // while (i < j) {
        // sum = sum - nums[i];
        // if (target == sum) {
        // i++;
        // k = j - i + 1;
        // size = Math.min(size, k);
        // flag = true;
        // // System.out.println("size" + size);
        // }
        // i++;
        // }
        // j++;
        // } else {
        // i++;
        // j++;
        // }
        // } else {
        // int k = j - i + 1;
        // size = Math.min(size, k);
        // flag = true;
        // // System.out.println("size" + size);
        // i++;
        // j++;
        // }

        // }
        // if (!flag) {
        // System.out.println(0);
        // } else {
        // System.out.println(size);
        // }
        // System.out.println(size);
    }
}
