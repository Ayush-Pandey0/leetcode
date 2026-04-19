class Solution {
    boolean dfs(int source,int destination,ArrayList<ArrayList<Integer>> adj,int[] visited){
        if(source==destination) return true;
        visited[source]=1;
        for(int i:adj.get(source)){
            if(visited[i]==0){
                if(dfs(i,destination,adj,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int []edg:edges){
            int u=edg[0];
            int v=edg[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] visited=new int[n];

        boolean ans=dfs(source,destination,adj,visited);
        return ans;

    }
}