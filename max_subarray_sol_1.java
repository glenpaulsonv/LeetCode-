class Solution {
    public int maxSubArray(int[] nums) {
        int currSubarray = nums[0];
        int maxSubarray = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int num = nums[i];
            currSubarray = Math.max(num,currSubarray+num);
            maxSubarray = Math.max(maxSubarray, currSubarray);
        }
        return maxSubarray;
    }
}

//Solution 1 


class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        for(int i=0;i<nums.length;i++)
        {
            max_ending_here = max_ending_here+nums[i];
            if(max_so_far<max_ending_here)
                max_so_far=max_ending_here;
            if(max_ending_here<0)
                max_ending_here=0;
            
        }
        return max_so_far;
    }
}

//Solution 2 - took the help of geekforgeeks solution


