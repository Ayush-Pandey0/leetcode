class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        Queue<int[]>q=new LinkedList<>();
        int visited[][]=new int[n][m];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&(i==0||j==0||i==n-1||j==m-1)){
                    q.add(new int[]{i,j});
                    visited[i][j]=1;
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
                if(x>=0&&y>=0&&x<n&&y<m&&board[x][y]=='O'&&visited[x][y]==0){
                    visited[x][y]=1;
                    q.add(new int[]{x,y});
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&visited[i][j]==0){
                    board[i][j]='X';
                }
            }
        }
        

    }
}