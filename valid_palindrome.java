class Solution {
     
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if((c>='a' && c<='z') || (c>='0' && c<='9'))
            {
                str.append(s.charAt(i));
            }
        }
        int k=str.length()-1;
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i]=str.charAt(i);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[k]) k--;
            else return false;
        }
        return true;
    }
}