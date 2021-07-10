class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> solList = new ArrayList<>();
        int n = nums.length;
        boolean[] result = new boolean[n+1];
        for(int i:nums)
        {
            if(result[i]==true)
            {
                solList.add(i);
            }
            else
            {
                result[i]=true;
            }
        }
        return solList;
        
    }
}