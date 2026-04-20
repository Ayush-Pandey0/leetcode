class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        Queue<int[]> q=new LinkedList<>();
        int faah=image[sr][sc];
        if(faah == color) return image;
        q.add(new int[]{sr,sc});
        image[sr][sc]=color;

        int []dx={-1,1,0,0};
        int []dy={0,0,-1,1};
        while(!q.isEmpty()){
            int node[]=q.poll();
            int a=node[0];
            int b=node[1];

            for(int i=0;i<4;i++){
                int x=a+dx[i];
                int y=b+dy[i];
                if(x>=0&&y>=0&&x<n&&y<m&&image[x][y]==faah){
                    image[x][y]=color;
                    q.add(new int[]{x,y});
                }
            }
        }
        return image;
    }
}