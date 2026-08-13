class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0 ;
        // this loop shift all non zero no. to the front  
        for(int i = 0 ; i<nums.length ; i++){
             if(nums[i]!=0){
                nums[j]=nums[i];
               j++;
             }
        }
        //this loop will fill the rest of space with zero "0"
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
        
    }
}