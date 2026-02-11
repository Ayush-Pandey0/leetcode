class Solution {
public:
    int specialTriplets(vector<int>& nums) {
        const long long MOD = 1e9 + 7;
        
        unordered_map<int, long long> right, left;
        
        // count all numbers in right initially
        for (int x : nums) right[x]++;
        
        long long result = 0;
        
        for (int j = 0; j < nums.size(); j++) {
            int val = nums[j];
            right[val]--;  // remove current j from right
            
            long long target = val * 2LL;
            
            long long countLeft = left[target];
            long long countRight = right[target];
            
            result = (result + (countLeft * countRight) % MOD) % MOD;
            
            left[val]++;  // now j becomes part of left
        }
        
        return result % MOD;
    }
};
