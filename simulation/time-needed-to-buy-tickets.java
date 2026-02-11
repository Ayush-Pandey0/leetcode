class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       Queue<Integer> q=new LinkedList<>();
        int n=tickets.length;
        for(int i=0;i<n;i++){
            q.add(i);
        } 
        int time=0;
        while(!q.isEmpty()){
            int curr=q.peek();
            q.poll();
            tickets[curr]--;
            time++;
            if(tickets[curr]>0){
                q.add(curr);
            }
            else if(tickets[curr]==0&&curr==k){
                return  time;
            }
        }
        return time;

    }
}