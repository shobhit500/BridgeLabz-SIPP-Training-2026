import java.util.*;

public class Sumequal_tok {

    public static int subarraySumEqualsK(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : arr) {

            prefixSum += num;

            count += map.getOrDefault(prefixSum - k, 0);

            map.put(prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] revenue = {1, 2, 3, -3, 2};

        int k = 3;

        System.out.println(subarraySumEqualsK(revenue, k));
    }
}