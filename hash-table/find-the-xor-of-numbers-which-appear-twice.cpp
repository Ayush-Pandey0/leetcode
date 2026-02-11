class Solution {
public:
    int duplicateNumbersXOR(vector<int>& nums) {
        int freq[51]={0};
        for(auto i:nums){
            freq[i]++;
        }
        int num=0;
        for(int i=0;i<=50;i++){
            if(freq[i]==2) num^=i;
        }
        return num;
    }
};