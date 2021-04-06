class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int carry=1;
        int n=digits.length;
        for(int i=n-1;i>-1;i--)
        {
            int sum=digits[i]+carry;
            int val=sum%10;
            carry=sum/10;
            result.add(val);
        }
        if(carry>0)
        {
            result.add(carry);
        }
        int[] finalArr = new int[result.size()];
        int i=0;
        for(int k=result.size()-1;k>-1;k--)
        {
            finalArr[i]=result.get(k);
            i++;
        }
        return finalArr;
        
    }
}