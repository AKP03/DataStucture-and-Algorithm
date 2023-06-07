package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class countPrime {

    public static int primeNumber(int n, boolean[] visit) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!visit[i]) {

                for (int j = i; j < n; j += i) {

                    visit[j] = true;
                    // System.out.println(Arrays.toString(visit));
                }
            }

            for (i = 2; i < n; i++) {
                if (visit[i]) {
                    count = count + 1;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        boolean[] visit = new boolean[n + 1];
        // System.out.println(Arrays.toString(visit));
        int ans = primeNumber(n, visit);
        System.out.println(ans);
    }
}
