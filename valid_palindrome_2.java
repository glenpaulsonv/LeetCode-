class Solution {
    public boolean isPalindrome(String s, int low, int high)
    {
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<high)
        {
            if(s.charAt(low)==s.charAt(high))
            {
                low++;
                high--;
            }
            else
            {
                if((isPalindrome(s, low+1, high)) || (isPalindrome(s, low, high-1)))
                    return true;
                return false;
               
            }
            
        }
        return true;
    }
}