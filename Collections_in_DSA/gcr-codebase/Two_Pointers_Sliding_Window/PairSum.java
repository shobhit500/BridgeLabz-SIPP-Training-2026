import java.util.Arrays;

public class PairSum {

    public static int[] findPairSum(int[] transactions, int target) {

        int left = 0;
        int right = transactions.length - 1;

        while (left < right) {

            int sum = transactions[left] + transactions[right];

            if (sum == target) {
                return new int[]{transactions[left], transactions[right]};
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] transactions = {5, 10, 20, 35, 40, 50};
        int target = 55;

        int[] result = findPairSum(transactions, target);

        if (result[0] != -1)
            System.out.println("Pair Found: " + Arrays.toString(result));
        else
            System.out.println("Pair Not Found");
    }
}