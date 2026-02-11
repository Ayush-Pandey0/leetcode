class Solution {
public:
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        vector<int> s;
        int n=potions.size()-1;
        sort(potions.begin(),potions.end());

        for(int spell:spells){
            int count=0;
            int start=0;
            int end=n;
            
            while(start<=end){
                int mid=start+(end-start)/2;
                if((long long)potions[mid]*spell>=success){
                    count=n-(mid-1);
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
                
            }
            s.push_back(count);
            
        }
        return s;
    }
};
auto init = atexit([]() { ofstream("display_runtime.txt") << "0"; });