class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c =='#'){
                if(!st.isEmpty()) st.pop();
            }
            else{
                st.push(c);
            }
        } 
          Stack<Character> sa = new Stack<>();
        for(char a : t.toCharArray()){
            if(a=='#'){
                if(!sa.isEmpty()) sa.pop();
            }
            else{
                sa.push(a);
            }
        }
        if(st.equals(sa)){
            return true;
        }
       else return false;
    }
}