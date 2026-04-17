class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        int visited[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                Queue<Integer> q = new ArrayDeque<>();
                q.add(i);
                visited[i] = 1;
                while (!q.isEmpty()) {
                    int node = q.poll();
                    for (int j = 0; j < n; j++) {
                        if (isConnected[node][j] == 1 && visited[j] == 0) {
                            visited[j] = 1;
                            q.add(j);
                        }
                    }
                }                                                         
                count++;
            }
        }
        return count;
    }
}