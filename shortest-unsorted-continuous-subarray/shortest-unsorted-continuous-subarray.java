class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int count1 = -1, count2 = -2;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count1 = i;
                break;
            }
        }

        if (count1 == -1) {
            return 0;
        }

        for (int i = nums.length - 1; i > count1; i--) {
            if (nums[i] < nums[i - 1]) {
                count2 = i;
                break;
            }
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = count1; i <= count2; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        for (int i = 0; i < count1; i++) {
            if (nums[i] > min) {
                count1 = i;
                break;
            }
        }
        for (int i = nums.length - 1; i > count2; i--) {
            if (nums[i] < max) {
                count2 = i;
                break;
            }
        }

        return count2 - count1 + 1;
    }
}
