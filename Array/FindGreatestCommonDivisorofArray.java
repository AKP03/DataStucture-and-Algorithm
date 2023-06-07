package Array;

import java.util.*;

public class FindGreatestCommonDivisorofArray {

    public static int gcd(int r1, int r2) {
        if (r2 == 0)
            return r1;
        return gcd(r2, r1 % r2);

    }

    public static void main(String[] args) {
        // int[] arr = { 2, 5, 6, 9, 10 };
        int[] arr = { 7, 5, 6, 8, 3 };
        // int[] arr = { 3, 3 };

        Arrays.sort(arr);

        int smallest = arr[0];
        int largest = arr[arr.length - 1];

        int ans = gcd(smallest, largest);
        System.out.println(ans);

    }
}
