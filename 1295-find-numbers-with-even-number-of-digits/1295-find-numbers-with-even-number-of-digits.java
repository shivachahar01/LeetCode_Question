class Solution {
    public int findNumbers(int[] nums) {
        int count = 0 ; 
        int countB= 0;
        for(int i = 0 ; i <nums.length ; i++){
            int num = nums[i];
            while(num>0){
                count++;
                num = num/10;
                
            }
            if(count%2==0){
                countB++;
            }
             count=0;
        }
       
        return countB;
    }
}