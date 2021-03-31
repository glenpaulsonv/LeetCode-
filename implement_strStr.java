class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.isEmpty()&&needle.isEmpty()) return 0;
        else if(haystack.isEmpty()) return -1;
        else if(haystack.indexOf(needle)>=0)
        {
            return haystack.indexOf(needle);
        }
        else
            return -1;
        
    }
}
