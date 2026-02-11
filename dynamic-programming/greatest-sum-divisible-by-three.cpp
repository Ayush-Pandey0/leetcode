#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxSumDivThree(vector<int>& nums) {
        const int NEG = -1e9;
        int dp[3] = {0, NEG, NEG}; // dp[r] = max sum with sum % 3 == r
        for (int v : nums) {
            int r = v % 3;
            int nxt[3];
            for (int i = 0; i < 3; ++i) nxt[i] = dp[i]; // keep without using v
            for (int i = 0; i < 3; ++i) {
                if (dp[i] > NEG) {
                    int ni = (i + r) % 3;
                    nxt[ni] = max(nxt[ni], dp[i] + v);
                }
            }
            // also consider taking v alone (already handled because dp[0]=0)
            for (int i = 0; i < 3; ++i) dp[i] = nxt[i];
        }
        return max(0, dp[0]); // dp[0] could be negative sentinel, but answer >= 0
    }
};
