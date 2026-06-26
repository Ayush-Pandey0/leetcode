class Solution {
    int find(List<List<Integer>> triangle,int i,int j,int[][]dp){
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        int down=find(triangle,i+1,j,dp);
        int downright=find(triangle,i+1,j+1,dp);
        return dp[i][j]=triangle.get(i).get(j)+Math.min(down,downright);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int i=0;
        int j=0;
        int n=triangle.size();
        int m=triangle.get(n-1).size();
        int[][]dp=new int[n][m];
        for(int id[]:dp)
            Arrays.fill(id,Integer.MAX_VALUE);
        return find(triangle,i,j,dp);
    }
}
