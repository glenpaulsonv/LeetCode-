class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minprice)
                minprice = prices[i];
            else if(prices[i]-minprice>maxprofit)
                maxprofit=prices[i]-minprice;
        }
        return maxprofit;
    }
}

//solution 1 - took the help of leetcode solution
