class Solution {
    public int orangesRotting(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;

        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};

        int time=0;

        while(!q.isEmpty()){
            int size=q.size();
            boolean rotted = false;

            for(int i=0;i<size;i++){
                int[] node=q.poll();
                int x=node[0];
                int y=node[1];

                for(int j=0;j<4;j++){
                    int newx=dx[j]+x;
                    int newy=dy[j]+y;

                    if(newx>=0 && newy>=0 && newx<n && newy<m && grid[newx][newy]==1){
                        grid[newx][newy]=2;
                        q.add(new int[]{newx,newy});
                        fresh--;
                        rotted = true;
                    }
                }
            }

            if(rotted) time++; // ⭐ correct place
        }

        return (fresh==0)?time:-1;
    }
}