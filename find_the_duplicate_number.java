class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> rSet = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(rSet.contains(nums[i])) return nums[i];
            else rSet.add(nums[i]);
            
        }
        return -1;
    }
}