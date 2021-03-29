class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
        {
            return 0;
        }
        
        //note given array is already sorted
        
        int i = 0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1; //size of the array without the duplicate elements.
    }
}