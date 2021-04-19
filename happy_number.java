class Solution {
    public boolean isHappy(int n) {
        
        if(n<6 && n!=1) return false;
        if(n==1) return true;      
        
        int sum=0;
        while(n>0)
        {
            int r = n%10;
            sum = sum+(r*r);
            n=n/10;
        }
        return isHappy(sum);
    }
}

// took the help of the discussion platform - anusha267
