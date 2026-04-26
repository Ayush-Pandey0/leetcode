class Pair{
    int r;
    int c;
    int pr;
    int pc;
    Pair(int r,int c,int pr,int pc){
        this.r=r;
        this.c=c;
        this.pr=pr;
        this.pc=pc;
    }
}
class Solution {
    public boolean containsCycle(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
        Queue<Pair> q=new LinkedList<>(); 

        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]){
                    q.add(new Pair(i,j,-1,-1));
                    visited[i][j]=true;
                    char currentkey=grid[i][j];
                    while(!q.isEmpty()){
                        Pair d=q.poll();
                        int currentrow=d.r;
                        int currentcol=d.c;
                        int parentrow=d.pr;
                        int parentcol=d.pc;
                        for(int faah=0;faah<4;faah++){
                            int x=dx[faah]+currentrow;
                            int y=dy[faah]+currentcol;
                            if(x>=0&&y>=0&&x<n&&y<m&&!visited[x][y]&&grid[x][y]==currentkey){
                                q.add(new Pair(x,y,currentrow,currentcol));
                                visited[x][y]=true;
                            }
                            else if(x>=0&&y>=0&&x<n&&y<m&&visited[x][y]==true&&(x!=parentrow||y!=parentcol)&&grid[x][y]==currentkey) return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}