import java.util.*;

public class LongestSubarrayKDistinct {

    public static int longestSubarrayWithAtMostKDistinct(int[] keyIds, int k) {

        Map<Integer, Integer> frequency = new HashMap<>();

        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < keyIds.length; end++) {

            frequency.put(keyIds[end],
                    frequency.getOrDefault(keyIds[end], 0) + 1);

            while (frequency.size() > k) {

                frequency.put(keyIds[start],
                        frequency.get(keyIds[start]) - 1);

                if (frequency.get(keyIds[start]) == 0)
                    frequency.remove(keyIds[start]);

                start++;
            }

            maxLength = Math.max(maxLength,
                    end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] keyIds = {1, 2, 1, 2, 3, 2, 2, 1};
        int k = 2;

        System.out.println(longestSubarrayWithAtMostKDistinct(keyIds, k));
    }
}