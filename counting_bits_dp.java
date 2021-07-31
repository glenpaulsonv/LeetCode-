class Solution {
    public int[] countBits(int n) {
        int ans[]= new int[n+1];
        int offset=1;
        for(int index=1;index<n+1;++index)
        {
            if(offset*2 == index)
                offset *=2;
            ans[index]=ans[index-offset]+1;
        }
        return ans;
    }
}

//took the help of discussion platform and youtube