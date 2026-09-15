class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(min > prices[i]){
                min = prices[i];
            }
            int profit = prices[i] - min;
            max = Math.max(profit,max);
        }
        return max;
    }
}

