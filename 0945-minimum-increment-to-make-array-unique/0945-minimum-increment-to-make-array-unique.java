class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        int result = 0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                int newVal = nums[i-1]+1;
                result += newVal - nums[i];
                nums[i] = newVal;   
            }
        }
        return result;
    }
}