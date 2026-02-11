class Solution {
public:
    int maxBalancedSubarray(vector<int>& nums) {

        // Storing input midway (per instruction)
        vector<int> norivandal = nums;

        unordered_map<long long, unordered_map<int,int>> mp;

        int px = 0;    // prefix XOR
        int bal = 0;   // even-odd balance
        int ans = 0;

        // Base case: before starting (px=0, bal=0) at index -1
        mp[0][0] = -1;

        for(int i = 0; i < nums.size(); i++) {
            px ^= nums[i];

            if(nums[i] % 2 == 0)
                bal++;     // even
            else
                bal--;     // odd

            // If this (px, bal) seen before
            if(mp[px].count(bal)) {
                ans = max(ans, i - mp[px][bal]);
            } else {
                mp[px][bal] = i; // store earliest index
            }
        }

        return ans;
    }
};
