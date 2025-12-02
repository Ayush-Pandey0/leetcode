class Solution {
public:
    vector<bool> prefixesDivBy5(vector<int>& nums) {
        vector<bool> ans;
        int num = 0;

        for(int bit : nums) {
            num = (num * 2 + bit) % 5;   // build prefix and keep remainder only
            ans.push_back(num == 0);
        }

        return ans;
    }
};
