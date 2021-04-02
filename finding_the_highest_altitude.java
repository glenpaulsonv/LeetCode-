class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int n=gain.length;
        for(int i=0;i<n;i++)
        {
            sum+=gain[i];
            gain[i]=sum;
        }
        Arrays.sort(gain);
        if(gain[n-1]<0) return 0;
        else return gain[n-1];
    }
}