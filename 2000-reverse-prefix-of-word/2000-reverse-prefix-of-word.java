class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String left = word.substring(0,index+1);
        String right = word.substring(index+1);
         StringBuilder sb = new StringBuilder(left);
         sb.reverse();
         return sb.toString()+right;
    }
}