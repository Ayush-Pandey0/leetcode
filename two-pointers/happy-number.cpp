class Solution {
public:
    bool isHappy(int n) {
        if(n==1||n==7) return true;
        if(n<=9&&n>1) return false;
        long long sum=0;
        int m;
        while(n>9){
            m=n;
            sum=0;
            while(m>0){
                int d=m%10;
                sum+=d*d;
                m=m/10;

            }
            if(sum==1||sum==7) return true;
            else{
                n=sum;
            }

        }
        return false;

    }
};