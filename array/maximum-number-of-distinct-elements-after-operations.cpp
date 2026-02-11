class Solution {
public:
    int maxDistinctElements(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        long long next_available = LLONG_MIN;
        int count = 0;

        for (long long num : nums) {
            long long low = num - k;
            long long high = num + k;
            long long val = max(next_available, low);
            
            if (val <= high) {
                count++;
                next_available = val + 1; // next distinct number must be greater
            }
        }
        return count;
    }
};
