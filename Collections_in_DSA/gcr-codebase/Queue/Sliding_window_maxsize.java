import java.util.*;

public class Sliding_window_maxsize {

    static int[] maxWindow(int[] arr, int k) {

        int n = arr.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() &&
                    arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                ans[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] readings = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;

        int[] result = maxWindow(readings, k);

        System.out.println("Maximum of each window:");

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}