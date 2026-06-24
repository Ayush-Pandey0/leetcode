class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->
            (b[1]*b[1]+b[0]*b[0])-(a[1]*a[1]+a[0]*a[0])
        );
        for(int []i:points){
            pq.offer(i);
            if(pq.size()>k) pq.poll();
        }
        int[][] ans=new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            int a[]=pq.poll();
            ans[i][0]=a[0];
            ans[i][1]=a[1];
            i++;
        }
        return ans;

    }
}