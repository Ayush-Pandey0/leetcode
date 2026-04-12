class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        int n=prices.length;
        for(int i=0;i<n;i++){
            int curr=prices[i];
            if(curr<buy){
                buy=curr;
            }
            else{
                profit=Math.max(profit,curr-buy);
            }
        }
        return profit;
    }
}