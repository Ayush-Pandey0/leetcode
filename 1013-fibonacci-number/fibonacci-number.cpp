class Solution {
public:
    int fib(int n) {
        int start=0;
        if(n==0||n==1) return n;
        int second=1;
        for(int i=2;i<=n;i++){
            int third=start+second;
            start=second;
            second=third;
        }
        return second;
        
    }
};