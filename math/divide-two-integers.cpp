class Solution {
public:
    int divide(int dividend, int divisor) {
        long long rem=(long long)dividend/divisor;
        if(rem>INT_MAX) return INT_MAX;
        if(rem<INT_MIN) return INT_MIN;
        return ceil(rem);
    }
};