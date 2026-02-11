class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.empty()) return 0;
        int longest=0;
        unordered_set<int> st(nums.begin(),nums.end());
        for(int num:st){
            if(st.find(num-1)==st.end()){
                int length=1;
                int next=num+1;
                while(st.find(next)!=st.end()){
                    length++;
                    next++;
                }
                longest=max(length,longest);
            }
        }
        return longest;

    }
};