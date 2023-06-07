package Array;

public class countKthMissingNumber {

    public static int findMissingNumber(int[] arr, int s, int e, int k) {
        if (s > e) {
            return e;
        }
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        int l = pivot - m;
        if (k > l) {
            findMissingNumber(arr, s, m - 1, k);
        } else if (k < l) {
            findMissingNumber(arr, m + 1, e, k);
        }

        return e;
    }

    public static void main(String[] args) {
        int[] num = { 2, 3, 4, 7, 11 };

        int k = 5;
        // int[] num={0,1,2,3};

        int ans = findMissingNumber(num, 0, num.length - 1, k);
        System.out.println(ans + k);
    }
}
