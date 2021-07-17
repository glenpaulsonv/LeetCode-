class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char c:stones.toCharArray())
        {
            if(jewels.indexOf(c)!=-1)
            {
                count++;
            }
        }
        return count;
    }
}


//solution 2 - using hashset

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jSet = new HashSet<>();
        for(char c:jewels.toCharArray())
        {
            jSet.add(c);
        }
        int count = 0;
        for(char c:stones.toCharArray())
        {
            if(jSet.contains(c)) count++;
        }
        return count;
    }
}