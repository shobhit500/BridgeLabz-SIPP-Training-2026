import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreater(int[] visitors) {

        int n = visitors.length;
        int[] answer = new int[n];

        Arrays.fill(answer, -1);

        // Stack stores indices
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && visitors[i] > visitors[stack.peek()]) {

                int index = stack.pop();
                answer[index] = visitors[i];
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] visitors = {4, 5, 2, 10, 8};

        int[] result = nextGreater(visitors);

        System.out.println("Visitors      : " + Arrays.toString(visitors));
        System.out.println("Next Greater  : " + Arrays.toString(result));
    }
}