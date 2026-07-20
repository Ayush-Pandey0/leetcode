class Solution {
    public void solve(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visited[][]=new int[n][m];
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0||j==0||i==n-1||j==m-1)&&(grid[i][j]=='O')){
                    q.add(new int[]{i,j});
                }
            }
        }
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int no[]=q.poll();
            int i=no[0];
            int j=no[1];
            visited[i][j]=1;
            for(int k=0;k<4;k++){
                int x=i+dir[k][0];
                int y=j+dir[k][1];
                if(x>=0&&y>=0&&x<n&&y<m&&grid[x][y]=='O'&&visited[x][y]==0){
                    q.add(new int[]{x,y});
                    visited[x][y]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0){
                    grid[i][j]='X';
                }
            }
        }
    }
}