class Solution {
    public int missingNumber(int[] nums) {
        int expSum = nums.length*(nums.length+1)/2;
        int actSum = 0;
        for(int i:nums)
        {
            actSum+=i;
        }
        return expSum - actSum;
    }
}

//Solution 1 - Using Gauss Formula for the sum of first n natural no.s - took the help of the leetcode solution
