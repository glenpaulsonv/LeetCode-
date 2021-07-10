import java.util.Arrays;
import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> solList= new ArrayList<>();
        int n = nums.length;
        boolean[] result = new boolean[n+1];
        for(int i:nums)
        {
            result[i]=true;
        }
        
        for(int j=1;j<result.length;j++)
        {
            if(!result[j])
            {
                solList.add(j);
            }
        }
        return solList;
    }
}

//took the help of the discussion platform - prashantp95
