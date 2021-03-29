class Solution {
   
    private HashMap<Character, Character> map;
    
    public Solution()
    {
        this.map = new HashMap<Character, Character>();
        this.map.put('(', ')');
        this.map.put('{', '}');
        this.map.put('[', ']');
    }
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            
            if(map.containsKey(c))
            {
                stack.push(map.get(c));
            }
            else if(map.containsValue(c))
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else if(stack.pop()!=c)
                {
                    return false;
                }
            }
        }
     return stack.isEmpty();   
    }
}