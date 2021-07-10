import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return true;
        
        }
        return false;
    }
}


//took the help of leetcode solution

// Solution 2

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        
            for (int i:nums)
            {
                if(set.contains(i)) return true;
                set.add(i);
                
            }
            return false;
        
    }
}

//took the help of leetcode solution