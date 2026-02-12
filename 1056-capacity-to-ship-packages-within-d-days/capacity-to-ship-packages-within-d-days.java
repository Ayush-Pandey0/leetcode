class Solution {
    public int canship(int[] w,int mid){
        int days=0;
        int sum=0;
        for(int i:w){
            if(sum+i>mid){
                sum=0;
                days++;
            }
            sum+=i;
        }
        days++;
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=1;
        int high=0;
        for(int i:weights){
            low=Math.max(low,i);
            high+=i;
        }

        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canship(weights,mid)<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
}