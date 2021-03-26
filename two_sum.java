class Solution {
    public int[] twoSum(int[] nums, int target) {
                
        int temp = 0;
        //int[] n;
        int l=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        { 
            temp = target - nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
               if(nums[j]==temp)
               {
                  //n = new int[]{i,j};
                   k = j;
                   l = i;
               }
                   
            }
        }
        return new int[]{l,k};
        
    }

}
