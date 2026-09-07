class Solution {
    public boolean isHappy(int n) {
        int rem = 0 ; 
        for(int i = 0 ; i <100 ; i++){
             int sum = 0 ;
      while( n > 0 ){
       
        rem= n%10;
        sum += rem*rem;
        n= n/10;}

        if(sum == 1){
            return true;
        }
      n=sum;}
      return false ;
    }
}