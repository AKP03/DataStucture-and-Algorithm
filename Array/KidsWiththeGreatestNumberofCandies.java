package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        // // int[] candies = { 4, 2, 1, 1, 2 };
        // // int extraCandies = 1;
        // int[] candies = { 12, 1, 12 };
        // int extraCandies = 10;
        int[] temp = new int[candies.length];
        for (int j = 0; j < candies.length; j++) {
            temp[j] = candies[j];
        }
        Arrays.sort(temp);
        int maxCandies = temp[candies.length - 1] + extraCandies;
        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int child = candies[i] + extraCandies;
            if (child >= maxCandies) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        System.out.println(list);
    }
}
