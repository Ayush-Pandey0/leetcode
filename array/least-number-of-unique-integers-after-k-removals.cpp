class Solution {
public:
    int findLeastNumOfUniqueInts(vector<int>& arr, int k) {
        unordered_map<int, int> freq;
        for (int num : arr) freq[num]++;
        
        vector<int> counts;
        for (auto &p : freq) counts.push_back(p.second);
        
        sort(counts.begin(), counts.end());
        
        int unique = counts.size();
        for (int c : counts) {
            if (k >= c) {
                k -= c;
                unique--;  // removed this number completely
            } else break;
        }
        return unique;
    }
};
