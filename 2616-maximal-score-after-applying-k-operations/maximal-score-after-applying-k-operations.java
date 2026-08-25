class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:nums){
            pq.add(i);
        }
        long sum=0;
        int count=0;
        while(count<k){
            int top=pq.poll();
            sum += top;

            pq.offer((int)Math.ceil((double)top / 3));
            count++;
        }
        return sum;
    }
}