class Solution {
    public int singleNumber(int[] nums) {
        int freq[] = new int[1000001];
        for(int i = 0 ; i <nums.length ; i++){
            freq[nums[i]+3000]++;
        }
        for(int i = 0 ; i <freq.length;i++){
        if(freq[i]==1){
            return i-3000;
        }}
        return -1;
    }
}