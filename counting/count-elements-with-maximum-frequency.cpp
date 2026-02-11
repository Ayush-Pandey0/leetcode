class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int x : nums) {
            mp[x]++;
        }
        int mx = 0;
        for(auto p : mp) {
            mx = max(mx, p.second);
        }
        int ans = 0;
        for(auto p : mp) {
            if(p.second == mx) ans += p.second;
        }

        return ans;
    }
};
