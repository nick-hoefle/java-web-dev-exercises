package exercises;

import java.util.ArrayList;

public class Sum {
    public static int sumEven (ArrayList<Integer> arr) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                total += arr.get(i);

            }
        }
        System.out.println(total);
        return total;
    }
}
