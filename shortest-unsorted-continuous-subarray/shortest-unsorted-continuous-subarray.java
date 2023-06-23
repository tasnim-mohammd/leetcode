class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start = -1, end = -2; // Initialize start and end with invalid indices

        // Find the leftmost index where the array is unsorted
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                start = i;
                break;
            }
        }

        // Array is already sorted, return 0
        if (start == -1) {
            return 0;
        }

        // Find the rightmost index where the array is unsorted
        for (int i = nums.length - 1; i > start; i--) {
            if (nums[i] < nums[i - 1]) {
                end = i;
                break;
            }
        }

        // Find the minimum and maximum elements within the unsorted subarray
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Extend the subarray to include elements that need to be sorted
        for (int i = 0; i < start; i++) {
            if (nums[i] > min) {
                start = i;
                break;
            }
        }
        for (int i = nums.length - 1; i > end; i--) {
            if (nums[i] < max) {
                end = i;
                break;
            }
        }

        return end - start + 1;
    }
}
