package Array;

public class NumberofSubsequencesThatSatisfytheGivenSumCondition {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 6, 7 };
        int target = 9;

        int s = 0;
        int e = nums.length - 1;
        int count = 0;
        for (int i = e; i >= 0; i--) {
            for (int j = e; j >= 0; j--) {
                if (nums[j] + nums[s] <= target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
