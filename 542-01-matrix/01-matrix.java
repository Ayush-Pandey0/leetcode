class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int visited[][]=new int[n][m];
        int dist[][]=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j,0});
                    visited[i][j]=1;
                }
            }
        }

        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};

        while(!q.isEmpty()){
            int []d=q.poll();
            int i=d[0];
            int j=d[1];
            int distance=d[2];
            dist[i][j]=distance;
            for(int k=0;k<4;k++){
                int x=dx[k]+i;
                int y=dy[k]+j;

                if(x>=0&&y>=0&&x<n&&y<m&&visited[x][y]==0){
                    q.add(new int[]{x,y,distance+1});
                    visited[x][y]=1;
                }
            }
        }
        return dist;
    }
}