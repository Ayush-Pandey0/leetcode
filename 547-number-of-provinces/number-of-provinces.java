class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        int n=isConnected.length;
        int visited[]=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                count++;
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                visited[i]=1;
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int j=0;j<isConnected.length;j++){
                        if(visited[j]==0&&isConnected[node][j]==1){
                            q.add(j);
                            visited[j]=1;
                        }
                    }
                }
            }
        }
        return count;
    }
}