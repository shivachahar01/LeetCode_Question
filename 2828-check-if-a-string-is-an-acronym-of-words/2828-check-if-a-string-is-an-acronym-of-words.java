class Solution {
    // recursion
    // public boolean isAcronym(List<String> words, String s) {
    //      if (words.size() != s.length()) {
    //         return false;
    //     }

    //    return yes(words , s , 0); 
    // }
    // static boolean yes(List<String> word , String a , int i ){
    //    if(i==word.size()){
    //         return true;
    //     }
    //     if(word.get(i).charAt(0)!=a.charAt(i)){
    //         return false;
    //     }
    //     return yes(word , a , i+1);
    // }

    //brute force approch
      public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }

        for(int i = 0 ; i < s.length() ; i++){
            if(words.get(i).charAt(0)!=s.charAt(i)){
                return false;
            }
        }
        return true;
      }


}