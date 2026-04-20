class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dx[] = { -1, 1, 0, 0 };
        int dy[] = { 0, 0, -1, 1 };
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count=0;
                if (grid[i][j] == 1) {
                    count=dfs(i,j,grid);
                    // Queue<int[]> q = new LinkedList<>();
                    // q.add(new int[] { i, j });
                    // grid[i][j] = 0;
                    

                    // while (!q.isEmpty()) {
                    //     int []node=q.poll();
                    //     int a=node[0];
                    //     int b=node[1];

                    //     for(int k=0;k<4;k++){
                    //         int x=dx[k]+a;
                    //         int y=dy[k]+b;
                    //         if(x>=0&&y>=0&&x<n&&y<m&&grid[x][y]==1){
                    //             q.add(new int[]{x,y});
                    //             grid[x][y]=0;
                    //         }
                    //     }
                    //     count++;
                    // }
                }
                ans=Math.max(count,ans);
            }
        }
        return ans;
    }
    int dfs(int i,int j,int[][] grid){
        if(i>=grid.length||j>=grid[0].length||i<0||j<0||grid[i][j]==0) return 0;
        int area=1;
        grid[i][j]=0;
        area+=dfs(i-1,j,grid);
        area+=dfs(i+1,j,grid);
        area+=dfs(i,j-1,grid);
        area+=dfs(i,j+1,grid);
        return area;
    }
}