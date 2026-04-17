class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        int time=0;
        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                int row = p.row;
                int col = p.col;
                for(int j=0;j<4;j++){
                    int x=dx[j]+row;
                    int y=dy[j]+col;
                    if(x>=0&&y>=0&&x<n&&y<m&&grid[x][y]==1){
                        grid[x][y]=2;
                        fresh--;
                        q.add(new Pair(x,y));
                    }
                }
            }
            time++;

        }
        return fresh==0?time:-1;

    }
}