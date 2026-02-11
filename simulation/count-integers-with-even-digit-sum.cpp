class Solution {
public:
    int countEven(int num) {
        int sum=0;
        int count=0;
        int n;
        for(int i=1;i<=num;i++){
            sum=0;
            n=i;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            if(sum%2==0) count++;

        }
        return count;
    }
};