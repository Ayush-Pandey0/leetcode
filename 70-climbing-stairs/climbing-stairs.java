class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int prev=1;
        int prev2=1;
        for(int i=2;i<=n;i++){
            int curr=prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
        // int[] dp=new int[n+1];
        // Arrays.fill(dp, -1);
        // return c(n,dp);
    }
    public int c(int n,int[] dp){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        int step1=c(n-1,dp);
        int step2=c(n-2,dp);
        dp[n]=step1+step2;
        return dp[n];

    }

}