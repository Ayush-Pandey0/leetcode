class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n=piles.length-1;
        int start=1;
        int end=piles[n];
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            long sumh=0;
            for (int p : piles) {
                sumh += Math.ceil((double)p / mid);

            }
            if(sumh>h){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;

    }
}