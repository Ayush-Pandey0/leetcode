class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        unordered_set<int> mp;
        int i=0;
        while(i<nums.size()){
            if(mp.find(nums[i])!=mp.end()){
                return nums[i];
            }
            else{
                mp.insert(nums[i]);
            }
            i++;
        }
        return -1;
    }
};