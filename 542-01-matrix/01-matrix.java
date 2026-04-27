class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        int distance[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j});
                    distance[i][j]=0;
                }else{
                    distance[i][j]=-1;
                }
            }
        }

        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        while(!q.isEmpty()){
            int d[]=q.poll();
            int i=d[0];
            int j=d[1];
            
            for(int k=0;k<4;k++){
                int x=dx[k]+i;
                int y=dy[k]+j;

                if(x>=0&&y>=0&&x<n&&y<m&&distance[x][y]==-1){
                    distance[x][y]=distance[i][j]+1;
                    q.add(new int[]{x,y});
                }
            }


        }
        return distance;


    }
}