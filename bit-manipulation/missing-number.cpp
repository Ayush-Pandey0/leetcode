class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        int total = n * (n + 1) / 2;  // expected sum
        int sum = 0;
        for (int num : nums) sum += num;
        return total - sum;
    }
};
