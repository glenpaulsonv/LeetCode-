class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> no_duplicate_list = new ArrayList<>();
        for(int i:nums)
        {
            if(!no_duplicate_list.contains(i))
            {
                no_duplicate_list.add(i);
            }
            else
            {
                no_duplicate_list.remove(new Integer(i));
            }
        }
        return no_duplicate_list.get(0);
    }
}

//solution 1 - ^ took the help of leetcode solution



class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        for(int i:nums)
        {
            a = a^i;
        }
        return a;
    }
}

//Solution 2 - using bit manipulation - took the help of leetcode solution

class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sumOfSet = 0;
        int sumOfNum = 0;
        for(int i:nums)
        {
            if(!set.contains(i))
            {
                set.add(i);
                sumOfSet+=i;
            }
            sumOfNum+=i;            
        }
        return 2*sumOfSet - sumOfNum;
    }
}

//Solution 3 - using sets - took the help of leetcode solution