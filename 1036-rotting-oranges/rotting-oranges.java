class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) {
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1)
                    fresh++;
            }
        }
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        int time=0;
        while(!q.isEmpty()){
            boolean rotten=false;
            int size=q.size();
            for(int i=0;i<size;i++){
                int node[]=q.poll();
                int a=node[0];
                int b=node[1];
                for(int j=0;j<4;j++){
                    int x=dx[j]+a;
                    int y=dy[j]+b;

                    if(x>=0&&y>=0&&x<grid.length&&y<grid[0].length&&grid[x][y]==1){
                        fresh--;
                        grid[x][y]=2;
                        q.add(new int[]{x,y});
                        rotten=true;
                    }
                }
            }
            if(rotten) time++;
        }
        return (fresh==0)?time:-1;
    }
}