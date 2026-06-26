class Solution {
    int find(int[][] grid,int i,int j,int n,int m,int[][]dp){
        if(i>=n||j>=m) return Integer.MAX_VALUE;
        if(i==n-1&&j==m-1) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int right=find(grid,i,j+1,n,m,dp);
        int down=find(grid,i+1,j,n,m,dp);
        dp[i][j]=grid[i][j]+Math.min(right,down);
        return dp[i][j];

    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int i=0,j=0;
        int dp[][]=new int[n][m];
        for(int in[]:dp)
            Arrays.fill(in,-1);
        return find(grid,i,j,n,m,dp);
    }
}