import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        
        // Step 1: Add all 0s in queue, mark 1s as -1
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 0) {
                    q.offer(new int[]{i, j});
                } else {
                    mat[i][j] = -1;  // mark unvisited
                }
            }
        }
        
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        
        // Step 2: BFS
        while(!q.isEmpty()) {
            int[] curr = q.poll();
            
            for(int[] d : dir) {
                int ni = curr[0] + d[0];
                int nj = curr[1] + d[1];
                
                if(ni >= 0 && nj >= 0 && ni < m && nj < n && mat[ni][nj] == -1) {
                    mat[ni][nj] = mat[curr[0]][curr[1]] + 1;
                    q.offer(new int[]{ni, nj});
                }
            }
        }
        
        return mat;
    }
}