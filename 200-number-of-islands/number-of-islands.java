class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        // Queue<int[]> q=new LinkedList<>();
        int count=0;
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                    // q.add(new int[]{i,j});
                    // grid[i][j]='0';
                    // while(!q.isEmpty()){
                    //     int d[]=q.poll();
                    //     int a=d[0];
                    //     int b=d[1];
                    //     for(int k=0;k<4;k++){
                    //         int x=dx[k]+a;
                    //         int y=dy[k]+b;
                    //         if(x>=0&&y>=0&&x<n&&y<m&&grid[x][y]=='1'){
                    //             q.add(new int[]{x,y});
                    //             grid[x][y]='0';
                    //         }
                    //     }
                    // }
                }
            }
        }
        return count;
    }
    void dfs(char[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0') return;
        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}