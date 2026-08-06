class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++){
            int pro=1;
            int j=i;
            while(j>0){
                pro*=j%10;
                j/=10;
            }
            if(pro%t==0){
                return i;
            }
        }
        return -1;
    }
}