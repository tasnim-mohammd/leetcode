class Solution {
    public void sortColors(int[] nums) {
        int temp , low = 0 , high = nums.length -1, mid = 0;
        while(mid <= high)
        {
            switch(nums[mid])
            {
                case 0:{
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
                break;}

                case 1:{
                mid++;
                break;}

                case 2:{
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
                break;
                }
            }
        }
    }
}