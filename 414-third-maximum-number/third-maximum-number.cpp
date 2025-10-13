class Solution {
public:
    int thirdMax(vector<int>& nums) {
        set<int> s(nums.begin(), nums.end());  // store unique + sorted

        // If less than 3 distinct numbers, return the largest
        if (s.size() < 3)
            return *s.rbegin();

        // Move iterator 2 steps ahead from rbegin() → third largest
        auto it = s.rbegin();
        advance(it, 2);
        return *it;
    }
};
