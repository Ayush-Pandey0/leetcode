class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        int count=0;
        while(!q.isEmpty()){
            int size=q.size();
            boolean rotten=false;
            for(int i=0;i<size;i++){
                int node[]=q.poll();
                int a=node[0];
                int b=node[1];
                for(int j=0;j<4;j++){
                    int x=a+dx[j];
                    int y=b+dy[j];
                    if(x>=0&&y>=0&&x<n&&y<m&&grid[x][y]==1){
                        grid[x][y]=2;
                        q.add(new int[]{x,y});
                        rotten=true;
                        fresh--;
                    }
                }
            }
            if(rotten){
                count++;
            }
        }

        return (fresh==0)?count:-1;

    }
}