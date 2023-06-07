package Array;

import java.util.ArrayList;

public class pascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list.add(1);
                } else {
                    try {
                        list.add(outer.get(i - 2).get(j) + outer.get(i - 2).get(j - 1));
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("hello");
                    }

                }
            }
            outer.add(list);
        }
        System.out.println(outer);
    }
}
