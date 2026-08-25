class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:nums){
            pq.add(i);
        }
        long sum=0;
        while(k>0){
            int top=pq.poll();
            sum+=top;
            int el=(int)Math.ceil(top/3.0);
            System.out.println(el);
            pq.add(el);
            k--;
        }
        return sum;
    }
}