class Solution {
public:
    int triangularSum(vector<int>& nums) {
        int s=nums.size();
        if(s==1){
            return nums[0];
        }
        int curr=0;
        while(s>1){
            for(int i=0;i<nums.size()-1;i++){
                curr=nums[i];
                nums[i]=(curr+nums[i+1])%10;
            }
            s--;
        }
        return nums[0];
    }
};