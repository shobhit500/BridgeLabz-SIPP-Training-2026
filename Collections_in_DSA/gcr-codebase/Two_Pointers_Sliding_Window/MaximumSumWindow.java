public class MaximumSumWindow {

    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int start = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int end = 0; end < cpuLoad.length; end++) {

            windowSum += cpuLoad[end];

            if (end >= k - 1) {

                maxSum = Math.max(maxSum, windowSum);

                windowSum -= cpuLoad[start];
                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] cpuLoad = {10, 20, 30, 40, 50, 15, 10};
        int k = 3;

        System.out.println("Maximum Sum = " + maxSubarrayOfSizeK(cpuLoad, k));
    }
}