class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        
        int[] dp=new int[n+1];
        dp[1]=1; //number of ways to reach the first step is 1
        dp[2]=2; //number of ways to reach the second step is 2
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

//Dynamic Programming Approach
//took the help og leetcode solution


/*
Brute Force Approach 
//leetcode solution

public class Solution {
    public int climbStairs(int n) {
        return climb_Stairs(0, n);
    }
    public int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }
}


*/