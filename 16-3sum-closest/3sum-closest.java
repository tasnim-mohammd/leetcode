class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i <nums.length - 2; i++) {
            int left = i + 1;
            int right=nums.length - 1;

            while (left<right) {
                
                sum = nums[i] + nums[left] + nums[right];
                if (sum==target) {
                    return sum;
                } 
                else if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }
                if (sum <= target) {
                    left++;
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                } else {
                    right--;
                }
            }
        }
        return closest;
    }
}