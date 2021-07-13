class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> resultMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(resultMap.containsKey(nums[i]))
            {
                if(i-resultMap.get(nums[i])<=k) return true;
                else
                {
                    resultMap.put(nums[i],i);
                }
                    
            }
            else
            {
                resultMap.put(nums[i],i);
            }
        }
        return false;
    }
}

//took the help of the discussion platform - Jayant_Jawa
