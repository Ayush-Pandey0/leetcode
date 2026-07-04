class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->a-b);
        for(int i=0;i<nums.length;i++){
            if(x==nums[i]) q.offer(i);
        }
        int ans[]=new int[q.size()];
        int n[]=new int[queries.length];
        int i=0;
        while(q.size()>0){
            ans[i++]=q.poll();
        }
        i=0;
        for(int j:queries){
            if(j<=ans.length)
                n[i]=ans[j-1];
            else n[i]=-1;
            i++;
        }
        return n;
    }
}