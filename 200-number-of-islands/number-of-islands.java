class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    Queue<int[]> q=new LinkedList<>();
                    q.add(new int[]{i,j});
                    grid[i][j]='0';
                    while(!q.isEmpty()){
                        int []node=q.poll();
                        int x=node[0];
                        int y=node[1];

                        for(int k=0;k<4;k++){
                            int newx=dx[k]+x;
                            int newy=dy[k]+y;
                            if(newx>=0&&newy>=0&&newx<n&&newy<m&&grid[newx][newy]=='1'){
                                q.add(new int[]{newx,newy});
                                grid[newx][newy]='0';

                            }
                        }
                    }


                }
            }
        }
        return count;
    }
}