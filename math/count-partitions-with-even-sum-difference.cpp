class Solution {
public:
    int countPartitions(vector<int>& nums) {
        int S = 0;
        for(int x : nums) S += x;

        // If total sum is odd → no partition can give even difference
        if (S % 2 != 0) return 0;

        // Otherwise all i from 0 to n-2 are valid → (n-1 partitions)
        return nums.size() - 1;
    }
};
