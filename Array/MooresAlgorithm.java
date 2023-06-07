package Array;

import java.util.Scanner;

public class MooresAlgorithm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
        int count = 0;
        int res = 0;
        for (int num : arr) {
            if (count == 0) {
                res = num;
            }
            if (res != num) {

                count--;
            } else {
                count++;
            }
            System.out.println(res);
        }
    }
}
