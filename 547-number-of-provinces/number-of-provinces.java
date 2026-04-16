class Solution {

    void dfs(int i, int[][] isConnected, int[] visited) {
        visited[i] = 1;

        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && visited[j] == 0) {
                dfs(j, isConnected, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        int[] visited = new int[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(i, isConnected, visited);
            }
        }

        return count;
    }
}