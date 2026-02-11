class Solution {
    public boolean isBloom(int mid,int[] bloomDay,int m,int k){
        int count=0;
        int bou=0;
        for(int i:bloomDay){
            if(i<=mid){
                count++;
                if(count==k){
                    bou++;
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
        return bou>=m;

    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(m*k>n){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int end=Integer.MIN_VALUE;

        for(int i:bloomDay){
            low=Math.min(low,i);
            end=Math.max(end,i);
        }
        int ans=-1;
        while(low<=end){
            int mid=low+(end-low)/2;
            if(isBloom(mid,bloomDay,m,k)){
                ans=mid;
                end=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
}