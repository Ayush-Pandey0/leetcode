class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int visited[]=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                if(dfs(source,destination,adj,visited)) return true;
            }
        }
        return false;
    }
    boolean dfs(int source,int destination,ArrayList<ArrayList<Integer>> adj,int[] visited){
        visited[source]=1;
        if(source==destination) return true;
        for(int j:adj.get(source)){
            if(visited[j]==0){
                if(dfs(j,destination,adj,visited)) return true;
            }
        }
        return false;
    }
}