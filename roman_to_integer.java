class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> Symbol = new HashMap<>();
        Symbol.put('I',1);
        Symbol.put('V',5);
        Symbol.put('X',10);
        Symbol.put('L',50);
        Symbol.put('C',100);
        Symbol.put('D',500);
        Symbol.put('M',1000);
        
        int sum=0;
        int prev=0;
        int n=s.length();
        for(int i=n-1;i>-1;i--)
        {
            int curr=Symbol.get(s.charAt(i));
            if(curr<prev)
                sum-=curr;
            else
                sum+=curr;
            prev=curr;
            
        }
        return sum;
    }
}