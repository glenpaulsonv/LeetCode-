class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res=new ArrayList();
        
        for(int i=0;i<nums.length;i++)
        {
            int f=nums[i];
            int val=nums[i+1];
            
            while(f-->0)
            {                
                res.add(val);
            }
            i++;
                      
        }
        int size=res.size();
        int[] finalRes = new int[size];
            for(int j=0;j<size;j++)
            {
                finalRes[j]=res.get(j);
            }
            return finalRes;
        
    }
}