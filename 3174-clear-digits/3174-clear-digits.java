class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
           if(Character.isDigit(c)){
            st.pop();
           }
           else{
            st.push(c);
           }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}