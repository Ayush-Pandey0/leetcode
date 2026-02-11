class Solution {
public:
    vector<int> frequencySort(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int i:nums) mp[i]++;

        vector<pair<int,int>> arr;
        vector<int> res;

        for(auto &i:mp){
            arr.push_back(i);
        }

        sort(arr.begin(),arr.end(),[&](auto &a,auto &b){
            if(a.second!=b.second) return a.second<b.second;
            return a.first >b.first;
        });

        for(auto j:arr){
            for(int i=0;i<j.second;i++){
                res.push_back(j.first);
            }
        }
        return res;

    }
};