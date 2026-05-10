class Solution {
    public boolean isValid(String s) {
        Stack<Character> st  = new Stack<Character>();
        Map<Character,Character> mp = new HashMap<Character,Character>();
        mp.put('[',']');
        mp.put('{','}');
        mp.put('(',')');
        for(char ch : s.toCharArray()){
            if(ch=='[' || ch=='(' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    char c = mp.get(st.peek());
                    if(c==ch){
                        st.pop();               
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty() ? true : false;
    }
}
