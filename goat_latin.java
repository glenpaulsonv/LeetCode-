class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        String arr[] = sentence.split(" ");
        String a="a";
         String curr="";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            curr=arr[i];
            if(set.contains(curr.charAt(0)))
            {
                sb.append(curr+"ma");
            }
            else
            {
                sb.append(curr.substring(1)+curr.charAt(0)+"ma");
            }
            sb.append(a);
            a=a+"a";
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

//took the help of leetcode discussion platform
https://leetcode.com/LifeIsNotCoding