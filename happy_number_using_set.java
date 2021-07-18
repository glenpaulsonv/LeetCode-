class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n!=1)
        {
            int sol=0;
            while(n!=0)
            {
                
                sol += Math.pow(n%10,2);
                n = n/10;               
                               
            }
            if(set.contains(sol)) return false;
            set.add(sol);
            n = sol;
        }
        return true;
    }
}

//took the help of the leetcode discussion platform