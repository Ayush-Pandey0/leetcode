class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num<=0) return false;
        long long x=sqrt(num);
        return x*x==num;
    }
};