class Solution {
    int find(int i,int j,int m,int n,int[][]dp){
        if(i==0&&j==0) return 1;
        if(i<0||j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=find(i-1,j,m,n,dp);
        int left=find(i,j-1,m,n,dp);
        dp[i][j]=up+left;
        return up+left;
    }
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        int i=m-1;
        int j=n-1;
        return find(i,j,m,n,dp);
    }
}