class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int n=nums[0];
        for(int i=1;i<nums.size();i++){
            n^=nums[i];
        }
        // map<int,int> mp;
        // for(int i:nums){
        //     mp[i]++;
        // }
        // for(auto i:mp){
        //     if(i.second==1) return i.first;
        // }
        return n;

    }
};