class Solution {
    public boolean isvalid(int[]piles,int mid,int h){
        long hour=0;
        for(int i:piles){
            // int f=i/mid;
            // int d=i%mid;
            hour+=Math.ceil((double) i / mid);
            // if(d!=0) hour++;
        }
        if(hour<=h){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int i:piles){
            high=Math.max(high,i);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isvalid(piles,mid,h)){
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        return low;
    }
}