class Solution {
    public int maxScore(int[] card, int k) {
        int n=card.length;
        int leftsum=0,rightsum=0;
        for(int i=0;i<k;i++){
            leftsum+=card[i];
        }
        int maxsum=leftsum;
        int rightindex=n-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=card[i];
            rightsum+=card[rightindex];
            rightindex--;
            maxsum=Math.max(maxsum,leftsum+rightsum);

        }
        return maxsum;
    }
}