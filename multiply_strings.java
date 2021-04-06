class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")) return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        int[] sum=new int[n1+n2];
        
        for(int i=n1-1;i>-1;i--)
        {
            for(int j=n2-1;j>-1;j--)
            {
                int value = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                sum[i+j+1] = sum[i+j+1] + value;
                sum[i+j] += sum[i+j+1]/10;
                sum[i+j+1] = sum[i+j+1]%10;
            }
        }
        
        int k=0;
        while(sum[k]==0) k++;
        StringBuilder result = new StringBuilder();
        while(k<n1+n2)
        {
            result.append(sum[k++]);
        }
        
        return result.toString();
    }
}
//took the help of the discussion platform - zmith_nh
