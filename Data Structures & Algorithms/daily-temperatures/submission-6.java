class Solution {
    public class Pair{
        int x;
        int pos;
        Pair(int x, int pos){
            this.x = x;
            this.pos = pos;
        }
    }
    public int[] dailyTemperatures(int[] arr) {
        Stack<Pair> st = new Stack();
        int output[] = new int[arr.length]; 
        for(int i = arr.length-1 ; i>=0 ; i--){
            while(!st.isEmpty() && arr[i] >= st.peek().x){
               st.pop(); 
            }
            output[i]  = st.isEmpty() ? 0 : st.peek().pos - i;
            st.push(new Pair(arr[i],i));
        }
        return output;
    }
}
