class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<Integer>();
        int carry=1;
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            int value=(digits[i]+carry)%10;
            carry = (digits[i]+carry)/10;
            list.add(value);
        }
        if(carry>0)
        {
            list.add(carry);
        }
        int[] finalArr=new int[list.size()];
        int i=0;
        for(int k=list.size()-1;k>=0;k--)
        {
            finalArr[i]=list.get(k);
            i++;
        }
        return finalArr;
    }
}

