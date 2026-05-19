class Solution {
    public int maxProfit(int[] prices) {
        int minimum=Integer.MAX_VALUE;
        int maxprofit=Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){
            int curr=prices[i];
            minimum=Math.min(curr,minimum);
            maxprofit=Math.max(maxprofit,curr-minimum);
        }
        return maxprofit;
    }
}