class Solution {
public:
    long long sumAndMultiply(int n) {
        long long x = 0;
        long long sum = 0;

        // Extract digits in order
        string s = to_string(n);

        for(char c : s){
            if(c != '0'){
                int d = c - '0';
                x = x * 10 + d; // build number
                sum += d;      // sum of digits
            }
        }

        // If no non-zero digits, x remains 0 and sum is 0 → return 0
        return x * sum;
    }
};
