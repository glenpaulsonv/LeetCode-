class Solution {
    public int lengthOfLastWord(String s) {
        
        String strArr[] = s.split(" ");
        int len=0;
        if(strArr.length>0)
        {
            String str = strArr[strArr.length-1];
            len = str.length();
                        
        }
        
        return len;
    }
}