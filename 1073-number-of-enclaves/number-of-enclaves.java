class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visited[][]=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1&&(i==0||j==0||i==n-1||j==m-1)){
                    q.add(new int[]{i,j});
                    visited[i][j]=1;
                }
            }
        }

        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        while(!q.isEmpty()){
            int data[]=q.poll();
            int i=data[0];
            int j=data[1];
            for(int k=0;k<4;k++){
                int x=dx[k]+i;
                int y=dy[k]+j;

                if(x>=0&&y>=0&&x<n&&y<m&&grid[x][y]==1&&visited[x][y]==0){
                    q.add(new int[]{x,y});
                    visited[x][y]=1;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1&&visited[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}