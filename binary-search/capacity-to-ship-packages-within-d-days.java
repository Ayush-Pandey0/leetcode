class Solution {
    
    public int shipWithinDays(int[] weights, int days) {
        int mini=weights[0];
        int wholesum=0;
        for(int i:weights){
            mini=Math.max(i,mini);
            wholesum+=i;
        }
        int maxi=wholesum;
        int miniday=0;
        while(mini<=maxi){
            int c=1;
            int sum=0;
            int mid=mini+(maxi-mini)/2;
            for(int i:weights){
                if(sum+i>mid){
                    sum=0;
                    c++;
                }
                sum+=i;
            }
            if(c<=days){
                maxi=mid-1;
                miniday=mid;
            }
            else{
                mini=mid+1;
            }

        }
        return miniday; 
    }
}