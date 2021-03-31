class Solution {
    
    public void rRotateOnce(int[] a)
    {
        int temp=a[a.length-1];
        
        for(int j=a.length-1;j>0;j--)
        {
            a[j]=a[j-1];
        }
        a[0]=temp;
    }
    
    public void rotate(int[] nums, int k) {
        
        for(int i=0;i<k;i++)
        {
            rRotateOnce(nums);
        }
        
        System.out.println(nums);
        
    }
}
//rotating the array in the right direction