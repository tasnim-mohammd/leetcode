class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int i = 0; i<nums.length; i++)
        {
            if(!uniqueNumbers.add(nums[i]))
            {
                return nums[i];
            }
        }
        return -1;
    }
}