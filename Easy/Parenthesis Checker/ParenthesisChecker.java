
class ParenthesisChecker
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String s)
    {
        // add your code here
        Stack<Character> st = new Stack();
        Map<Character, Character> map = new HashMap();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        for(char c : s.toCharArray()){
            if(map.containsKey(c))
                st.push(c);
            else if(st.isEmpty() || c != map.get(st.pop()))
                return false;
        }
        return st.isEmpty();
    }
}