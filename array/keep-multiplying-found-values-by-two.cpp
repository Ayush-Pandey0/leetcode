class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        // Put all values in a set for fast lookup
        unordered_set<int> s(nums.begin(), nums.end());
        
        // Keep doubling while found
        while(s.count(original)) {
            original *= 2;
        }
        
        return original;
    }
};
