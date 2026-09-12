class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]==1){
            return 0;
        }
        for(int i = 0 ; i <nums.length-1 ; i++){
              if(nums[i+1]-nums[i]!=1){
                return nums[i]+1;
              }
        }
        return nums.length;
    }
}

// class Solution {
//    public int missingNumber(int[] arr) {

//         long sum1 = 0;
//         long sum2 = 0;
//         Arrays.sort(arr);
//        int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             sum1 += arr[i];
//         }

//         for (int i = 0; i <n+1; i++) {
//             sum2 += i;
//         }

//         return (int)(sum2 - sum1);
//     }
// }