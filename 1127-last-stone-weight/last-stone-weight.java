class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int s:stones){
            pq.offer(s);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            int d=a-b;
            if(d>0){
                pq.offer(d);
            }
        }
        return pq.isEmpty()?0:pq.peek();
    }
}