class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> st;
        vector<int> greater(nums2.size());
        for(int i=nums2.size()-1;i>=0;i--){
            while(!st.empty() && nums2[i]>=st.top()){
                st.pop();
            }

            if(st.empty()) greater[i] = -1;
            else greater[i] = st.top();

            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.size();i++){
            auto idx = find(nums2.begin(),nums2.end(),nums1[i]);
            int id = idx - nums2.begin();
            nums1[i] = greater[id];
        }
        return nums1;
    }
};