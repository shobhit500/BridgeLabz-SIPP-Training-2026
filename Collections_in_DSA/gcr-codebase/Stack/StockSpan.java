import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int[] load) {

        int n = load.length;
        int[] span = new int[n];

        // Stack stores indices
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Remove all smaller or equal previous loads
            while (!stack.isEmpty() && load[stack.peek()] <= load[i]) {
                stack.pop();
            }

            // Calculate span
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            // Push current index
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        int[] load = {100, 80, 60, 70, 60, 75, 85};

        int[] result = calculateSpan(load);

        System.out.println("Load : " + Arrays.toString(load));
        System.out.println("Span : " + Arrays.toString(result));
    }
}