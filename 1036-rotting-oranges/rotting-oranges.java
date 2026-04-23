class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                }
                else if(grid[i][j]==1) fresh++;
            }
        }

        int dx[] = { -1, 1, 0, 0 };
        int dy[] = { 0, 0, -1, 1 };
        int ans = 0;
        
        while(!q.isEmpty()){
            boolean rotten=false;
            int size=q.size();
            for(int mc=0;mc<size;mc++){
                int d[]=q.poll();
                int i=d[0];
                int j=d[1];
                for(int k=0;k<4;k++){
                    int x=dx[k]+i;
                    int y=dy[k]+j;
                    if(x>=0&&y>=0&&x<n&&y<m&&grid[x][y]==1){
                        fresh--;
                        q.add(new int[]{x,y});
                        rotten=true;
                        grid[x][y]=2;
                    }
                }

            }
            if(rotten) ans++;
            
        }

        return (fresh==0)?ans:-1;
    }
}