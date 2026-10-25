class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb= new StringBuilder();
        int temp = num;
        int n = Math.abs(num);
        if(num==0){
            return "0";
        }
        while(n!=0){
            int ld  = n%7;
            sb.append(ld);
            n = n/7;
        }
        if(num<0){
            sb.append('-');
        }
         sb.reverse();
       
        return sb.toString();

    }
}