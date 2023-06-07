package Array;

public class maximumSumOFSubArray {

    public static int optimizeArray(int[] arr) {
        int max = 0;
        int curr = 0;

        for (int i = 0; i < arr.length; i++) {
            curr = arr[i] + curr;
            if (curr > max) {
                max = curr;
            }
            if (curr < 0) {
                curr = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 5, -4, -2, 6, -1, 100, 2, -300 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = arr[j] + sum;
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);

        int ans = optimizeArray(arr);
        System.out.println(max);
    }

}
