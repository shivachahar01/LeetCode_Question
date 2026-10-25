class Solution {
    public int[] leftRightDifference(int[] arr) {
        int[] pre = new int[arr.length];
        pre[0] = 0;
        for(int i = 1;i<arr.length;i++){
            pre[i] = arr[i-1] + pre[i-1];
        }
        int[] suff = new int[arr.length];
        suff[arr.length-1] = 0;
        for(int i = suff.length-2;i>=0;i--){
            suff[i] = suff[i+1] + arr[i+1];
        }
        for(int i = 0;i<arr.length;i++){
            arr[i] = Math.abs(pre[i]-suff[i]);
        }
        return arr;

    }
}