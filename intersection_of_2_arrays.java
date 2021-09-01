class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i:nums1)
            set1.add(i);
        for(int j:nums2)
            set2.add(j);
        
        if(set1.size()<set2.size())
            return set_intersection(set1,set2);
        else return set_intersection(set2,set1);
    }
    public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2)
    {
        int[] arr = new int[set1.size()];
        int index=0;
        for(Integer k:set1) // 
        {
            if(set2.contains(k))
                arr[index++]=k;
        }
        //return arr;
        return Arrays.copyOf(arr,index);
    }
}

//took the help of leetcode Solution