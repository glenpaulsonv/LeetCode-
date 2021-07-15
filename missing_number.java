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

class Solution {
    public int missingNumber(int[] nums) {
        int missingNo = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            missingNo = missingNo^i^nums[i];
        }
        return missingNo;
    }
}

//Solution 2 - using Bit Manipulation - took the help of leetcode solution


class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        for(int j=0;j<nums.length+1;j++)
        {
            if(!set.contains(j)) return j;
        }
        return -1;
    }
}

//Solution 3 - using HashSet similar to Brute Force - took the help of the Leetcode solution