class Solution {
public:
    string frequencySort(string s) {
        unordered_map<char,int> mp;
        for(auto i:s){
            mp[i]++;
        }

        vector<pair<char,int>> arr;
        for(auto i:mp){
            arr.push_back(i);
        }

        sort(arr.begin(),arr.end(),[&](auto &au,auto &bu){
            if(au.second!=bu.second) return au.second>bu.second;
            return au.first<bu.first;
        });

        string ans="";
        for(auto i:arr){
            for(int j=0;j<i.second;j++){
                ans+=i.first;
            }
        }
        return ans;
    }
};