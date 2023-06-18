import java.util.Scanner;

public class Solution {

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxAverage = (double) sum / k;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            double average = (double) sum / k;

            if (average > maxAverage) {
                maxAverage = average;
            }
        }

        return maxAverage;
    }
}
