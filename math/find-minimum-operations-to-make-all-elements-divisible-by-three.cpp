class Solution {
public:
    int minimumOperations(vector<int>& nums) {
        int count=0;
        for(int i:nums){
            int m=i%3;
            if(m==0){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
};