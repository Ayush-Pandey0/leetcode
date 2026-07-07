class Solution {
    public long sumAndMultiply(int n) {
        long ans=0;
        long sum=0;
        int m=n;
        int rev=0;
        while(m>0){
            int d=m%10;
            if(d!=0){
                sum+=d;
                rev=rev*10+d;
            }
            m/=10;
        }
        int k=0;
        while(rev>0){
            int d=rev%10;
            k=k*10+d;
            rev/=10;
        }
        ans=k*sum;
        return ans;
    }
}