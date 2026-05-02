class Solution {
    public int maxProfit(int[] prices) {
        int minimumtillnow=Integer.MAX_VALUE;
        int ans=0;

        for(int i=0;i<prices.length;i++){
            minimumtillnow=Math.min(minimumtillnow,prices[i]);
            ans=Math.max(ans,prices[i]-minimumtillnow);
        }

        return ans;

    }
}