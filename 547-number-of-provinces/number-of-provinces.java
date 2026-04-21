class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int []visited=new int[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(visited[i]==0){
                count++;

                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                visited[i]=1;

                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int j=0;j<n;j++){
                        if(isConnected[node][j]==1&&visited[j]==0){
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