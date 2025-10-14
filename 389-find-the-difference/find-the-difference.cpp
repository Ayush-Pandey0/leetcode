class Solution {
public:
    char findTheDifference(string s, string t) {
        map<char,int>mp;
        char c;
        for(auto i:s){
            mp[i]++;
        }
        for(auto i:t){
            mp[i]++;
        }
        for (auto it = mp.begin(); it != mp.end(); ++it) {
           if(it->second%2!=0){
                return it->first;
           }
        }
        return '\0';

    }
};