class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        while(start<end)  //Binary Search Concept
        {
            long mid=(start+end)/2;
            long y=mid*mid;
            if(y==num) return true;
            else if(y>num) end=mid-1;
            else if(y<num) start=mid+1;
        }
        return start*start==num;
    }
}//took the help of the discussion platform