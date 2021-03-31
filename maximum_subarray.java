class Solution {
    public int maxSubArray(int[] nums) {
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];
        
        for(int i=1;i<nums.length;i++) //we're running the loop from the second element
        {
            int num = nums[i];
            //if current subarray is negative, we can get rid of it.
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }
        return maxSubarray;
    }
}

//Kadane's Algorithm - Dynamic Programming