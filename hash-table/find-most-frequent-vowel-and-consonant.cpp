class Solution {
public:
    int maxFreqSum(string s) {
        unordered_map<char,int> mp;
        for(char i:s){
            mp[i]++;
        }
        int mxv=0;
        int mxc=0;
        for(auto i:mp){
            if(i.first=='a'||i.first=='e'||i.first=='i'||i.first=='o'||i.first=='u'){
                if(i.second>mxv){
                    mxv=i.second;
                }
            }
            else{
                if(i.second>mxc){
                    mxc=i.second;
                }
                
            }
        }
        return mxc+mxv;
    }
};