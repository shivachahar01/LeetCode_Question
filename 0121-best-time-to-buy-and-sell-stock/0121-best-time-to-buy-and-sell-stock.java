class Solution {
    public int maxProfit(int[] prices) {
      int min  = Integer.MAX_VALUE;
      int maxprofit = Integer.MIN_VALUE; 
      for(int i=0 ; i < prices.length ; i++){
        if(prices[i]<min){
            min = prices[i];
        }
        int profit= prices[i]-min;
        // maxprofit = Math.max(maxprofit,profit);
        if(profit>maxprofit){
           maxprofit = Math.max(profit , maxprofit);
        }
      }
      return maxprofit;
    }
}