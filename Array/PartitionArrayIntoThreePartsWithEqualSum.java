package Array;

public class PartitionArrayIntoThreePartsWithEqualSum {

    public static boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }

        if (total % 3 != 0) {
            return false;
        }

        int equalSum = total / 3;
        int countPart = 0;

        total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = arr[i] + total;
            if (total == equalSum && countPart < 2 && i < arr.length) {
                countPart++;
                total = 0;
            }
        }

        if (total == equalSum) {
            countPart++;
        }

        return countPart == 3;
    }

    public static void main(String[] args) {

        // int[] arr = { 0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1 };
        // int[] arr = { 0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1 };
        int[] arr = { 3, 3, 6, 5, -2, 2, 5, 1, -9, 4 };

        System.out.println(canThreePartsEqualSum(arr));
    }
}
