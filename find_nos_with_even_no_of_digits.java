class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int k=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            while(n>0)
            {
                n=n/10;
                k++;
            }
            if(k%2==0)
            {
                count++;
            }
            k=0;
        }
        return count;
    }
}