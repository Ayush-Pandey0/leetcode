class Solution {
    public int orangesRotting(int[][] grid) {
        int rotten=0;
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    rotten++;
                }
            }
        }
        boolean rot=false;
        int direction[][]={{-1,0},{0,-1},{0,1},{1,0}};
        int step=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int node[]=q.poll();
                int a=node[0];
                int b=node[1];
                for(int j=0;j<4;j++){
                    int x=direction[j][0]+a;
                    int y=direction[j][1]+b;
                    if(x>=0&&y>=0&&x<n&&y<m&&grid[x][y]==1){
                        grid[x][y]=2;
                        q.offer(new int[]{x,y});
                        rotten--;
                        rot=true;
                        System.out.println(rotten+" "+x+" "+y);   
                    }
                }
            }
            if(rot==true)
                step++;
            rot=false;
        }
        System.out.println(rotten);
        return (rotten==0)?step:-1;

    }
}