class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int sqsum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            sqsum+=d*d;
            n/=10;
        }
        return (sqsum-sum)>=50;
    }
}