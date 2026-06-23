class Solution {
    public int find(int sr,int sc,int r,int c,int[][] grid,int[][] visited,int count){
        if(sr==grid.length||sc==grid[0].length||sr<0||sc<0||grid[sr][sc]==-1||visited[sr][sc]==1){
            return 0; 
        }
        if(sr==r&&sc==c){
            if(count==0){
                return 1; 
            }else {
                return 0;
            }
        }
        visited[sr][sc]=1;

        int top=find(sr-1,sc,r,c,grid,visited,count-1);
        int bottom=find(sr+1,sc,r,c,grid,visited,count-1);
        int left=find(sr,sc-1,r,c,grid,visited,count-1);
        int right=find(sr,sc+1,r,c,grid,visited,count-1);
        visited[sr][sc]=0;
        return top+bottom+left+right;
    }
    public int uniquePathsIII(int[][] grid) {
        int rstarti=0;
        int rstartj=0;
        int rendi=0;
        int rendj=0;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    rstarti=i;
                    rstartj=j;
                }else if(grid[i][j]==2){
                    rendi=i;
                    rendj=j;
                }else if(grid[i][j]==-1){
                    count++;
                }
            }
        }
        count=(grid.length*grid[0].length)-count;
        int[][] visited = new int[grid.length][grid[0].length];
        return find(rstarti,rstartj,rendi,rendj,grid,visited,count-1);
    }
}