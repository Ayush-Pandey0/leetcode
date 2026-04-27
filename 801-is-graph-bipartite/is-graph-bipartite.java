class Pair{
    int node;
    int col;
    Pair(int node,int col){
        this.node=node;
        this.col=col;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        for(int i=0;i<n;i++){
            color[i]=-1;
        }

        for(int j=0;j<n;j++){
            if(color[j]==-1){
                Queue<Pair> q=new LinkedList<>();
                q.add(new Pair(j,0));

                while(!q.isEmpty()){
                    Pair d=q.poll();
                    int node=d.node;
                    int c=d.col;
                    for(int i=0;i<graph[node].length;i++){
                        if(color[graph[node][i]]==-1){
                            color[graph[node][i]]=1-c;
                            q.add(new Pair(graph[node][i],1-c));
                        }
                        else if(color[graph[node][i]]==c){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}