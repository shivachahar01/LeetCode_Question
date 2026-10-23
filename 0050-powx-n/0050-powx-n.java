class Solution {
    public double myPow(double x, int n) {
      long power = n;
      if(power<0){
        power = -power;
      }
      double ans = pow(x,power);

      if(n<0){
        ans  = 1.0/ans;;
      }

      
      return ans;
    }

     static double pow(double x , long n){
         if(n==0){
            return 1.0;
        }
      
        double half = pow(x,n/2);

        if(n%2==0){
            return half*half;
        }
        return half*half*x;
        
    }
       
}