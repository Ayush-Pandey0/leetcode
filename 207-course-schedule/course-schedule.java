class Solution {
    boolean dfs(int i,int []visited,int[] pathvisited,ArrayList<ArrayList<Integer>> adj){
        visited[i]=1;
        pathvisited[i]=1;

        for(int j:adj.get(i)){
            if(visited[j]==0){
                if(dfs(j,visited,pathvisited,adj)==true) return true;
            }else if(pathvisited[j]==1) return true;
        }
        pathvisited[i]=0;
        return false;
    }
    public boolean canFinish(int n, int[][] p) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<p.length;i++){
            int u=p[i][0];
            int v=p[i][1];
            adj.get(u).add(v);
        }

        int visited[]=new int[n];
        int pathvisited[]=new int[n];

        for(int i=0;i<n;i++){
            if(visited[i]==0){
                if(dfs(i,visited,pathvisited,adj)==true) return false;
            }
        }
        return true;
    }
}