class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0 || (x%10==0 && x!=0))
        {
            return false;
        }
        
        int reversed = 0;
        while(x>reversed)
        {
            reversed = reversed*10 + (x%10);
            x = x/10;
        }
        
        return x==reversed || x==reversed/10;
    }
}

//note - negative numbers are not a palindrome
//numbers ending with 0 other than 0 itself are not palindromes
//if the length is an odd number, we can get rid of the middle digit by reversed/10