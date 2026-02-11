class Solution {
public:
    int getLucky(string s, int k) {
        int sum=0;
        int val;

        for(char i:s){
            val=(i-'a'+1);
            if(val<=9) sum+=val;
            else{
                while(val>0){
                    sum+=val%10;
                    val/=10;
                }
            }
        }
        int n;
        if(k==1) return sum;
        else{
            n=sum;
            sum=0;
            while(--k){
                while(n>0){
                    sum+=n%10;
                    n/=10;
                }
                n=sum;
                sum=0;
            }

        }

        return n;
    }
};