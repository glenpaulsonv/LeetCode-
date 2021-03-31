class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0)
            return "";
        String prefix = strs[0];//we are storing the first string in prefix
            
            for(int i=1;i<strs.length;i++) //we are starting the loop from the second element
            {
                while(strs[i].indexOf(prefix)!=0) //case - prefix not found at position '0'
                {
                    prefix=prefix.substring(0,prefix.length()-1); //removing the last character
                    if(prefix.isEmpty()) return "";
                    
                }
                
             }
        return prefix;
        
    }
}
//took the help of LeetCode Solution