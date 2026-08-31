class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int minutes=0;
        int dx[]={-1,0,1,0};
        int dy[]={0,-1,0,1};
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rotten = false;

            for (int k = 0; k < size; k++) {
                int[] curr = q.poll();

                int a = curr[0];
                int b = curr[1];

                for (int i = 0; i < 4; i++) {
                    int x = a + dx[i];
                    int y = b + dy[i];

                    if (x >= 0 && y >= 0 && x < n && y < m
                            && grid[x][y] == 1) {

                        grid[x][y] = 2;
                        q.add(new int[]{x, y});
                        rotten = true;
                    }
                }
            }

            if (rotten) {
                minutes++;
            }
        }

        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return minutes;
    }
}