class Solution {
public:
    vector<int> findXSum(vector<int>& nums, int k, int x) {
        int n = nums.size();
        vector<int> ans;

        for (int i = 0; i + k <= n; i++) {
            unordered_map<int, int> freq;
            
            // Count frequency of current subarray
            for (int j = i; j < i + k; j++) {
                freq[nums[j]]++;
            }

            // Store (frequency, value) pairs
            vector<pair<int, int>> v;
            for (auto& [val, cnt] : freq) {
                v.push_back({cnt, val});
            }

            // Sort by frequency (desc), then by value (desc)
            sort(v.begin(), v.end(), [](auto &a, auto &b) {
                if (a.first == b.first)
                    return a.second > b.second;
                return a.first > b.first;
            });

            // Take top x elements
            unordered_set<int> top;
            for (int j = 0; j < v.size() && j < x; j++)
                top.insert(v[j].second);

            // Calculate x-sum
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                if (top.count(nums[j])) sum += nums[j];
            }

            ans.push_back(sum);
        }

        return ans;
    }
};
