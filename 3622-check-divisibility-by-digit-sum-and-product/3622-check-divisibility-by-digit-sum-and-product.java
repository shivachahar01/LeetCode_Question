class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0 ; 
        int pro= 1 ;
        int rem = 0 ;
        int div =0;
        int temp = n;
        while(n>0){
            rem=  n%10;
            sum = sum+rem;
            pro = pro*rem;
            n = n/10;
        }
    div = (sum +pro);
        if(temp%div==0){
            return true;
        }
        return false;
    }
}