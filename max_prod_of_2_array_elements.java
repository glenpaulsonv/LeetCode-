class Solution {
    public int maxProduct(int[] nums) {
        
        int n=nums.length;
        //int resArr[] = new int[n];
        Arrays.sort(nums);
        return (nums[n-1]-1)*(nums[n-2]-1);  //based on the given condition
        
        
    }
}