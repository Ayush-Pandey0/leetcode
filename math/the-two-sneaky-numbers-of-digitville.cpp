class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        vector <int> ans;
        unordered_map<int,int> mp;
        for(int i:nums){
            mp[i]++;
        }
        int count=2;
        while(count){
            for(auto &i:mp){
                if(i.second==2){
                    ans.push_back(i.first);
                    count--;
                }
            }

        }
        return ans;
    }
};