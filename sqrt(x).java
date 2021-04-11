class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int start=1;
        int end=x/2;
        while(start<=end)  //Binary Search Concept
        {
            int mid=start+(end-start)/2;
            int y=x/mid;
            if(y==mid) return mid;
            if(y>mid) start=mid+1;
            else end=mid-1;
            
            
        }
        return end;
    }
}