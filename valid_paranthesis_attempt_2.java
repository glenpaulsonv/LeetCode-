class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                stack.push(map.get(c));
            }
            else if(map.containsValue(c))
            {
                if(stack.isEmpty()) return false;
                else if(stack.pop() != c) return false;
            }
        }
        return stack.isEmpty();
    }
}