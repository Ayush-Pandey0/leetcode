class Solution {
    boolean dfs(int i,int[]visited,int[]pathvisited,Stack<Integer> st,ArrayList<ArrayList<Integer>> adj){
        visited[i]=1;
        pathvisited[i]=1;

        for(int nei:adj.get(i)){
            if(visited[nei]==0){
                if(dfs(nei,visited,pathvisited,st,adj)==true) return true;
            }else if(pathvisited[nei]==1){
                return true;
            }
        }
        st.push(i);
        pathvisited[i]=0;
        return false;
    }
    public int[] findOrder(int n, int[][] p) {
        int[] ans=new int[n];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<p.length;i++){
            int u=p[i][1];
            int v=p[i][0];
            adj.get(u).add(v);
        }

        int visited[]=new int[n];
        int pathvisited[]=new int[n];
        Stack <Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            if(visited[i]==0){
                if(dfs(i,visited,pathvisited,st,adj)==true) return new int[0];
            }
        }

        int i=0;
        while(!st.isEmpty()){
            ans[i++]=st.pop();
        }
        return ans;
    }
}