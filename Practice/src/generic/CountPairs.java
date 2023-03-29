package generic;

import java.util.Arrays;
import java.util.List;

public class CountPairs {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2);
        int k = 1;
        countPairs(numbers, (long) k);
    }

    public static int countPairs(List<Integer> numbers, long k) {
        int pairCount = 0;

        for (int i = 0; i < numbers.size(); ++i) {
            if ((long) (Integer) numbers.get(i) + k == (long) (Integer) numbers.get(i + 1)) {
                ++pairCount;
            }

            System.out.println();
        }

        return 0;
    }
}
