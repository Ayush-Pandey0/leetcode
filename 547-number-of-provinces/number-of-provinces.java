class Solution {
    void dfs(int i,int[] visited,int[][] isConnected){
        visited[i]=1;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1&&visited[j]==0){
                dfs(j,visited,isConnected);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int ans=0;
        int n=isConnected.length;
        int []visited=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                ans++;
                dfs(i,visited,isConnected);
            }
        }
        return ans;

    }
}