public class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b)
                return true;
        }
        return false;
    }
}
//took the help of leetcode solution

//Alternate Solution - using Binary Search [0,c-a^2]

public class Solution {
    public boolean judgeSquareSum(int c) {
       for(long a=0;a*a<=c;a++)
       {
           int b=c-(int)(a*a);
           if(binary_search(0,b,b))
              return true;
       }
       return false;
    }
    public boolean binary_search(long s, long e, int n)
              {
                  if(s>e) return false;
                  long mid=(s+e)/2;
                  if(mid*mid==n) return true;
                  else if(mid*mid>n) return binary_search(s, mid-1,n);
                  else return binary_search(mid+1,e,n);
              }
}

//took the help of leetcode solution