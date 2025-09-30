class Solution {
public:
    int triangularSum(vector<int>& nums) {
        int s=nums.size();
        if(s==1){
            return nums[0];
        }
        vector<int> n=nums;
        
        while(s>1){
            for(int i=0;i<nums.size()-1;i++){
                n[i]=(n[i]+n[i+1])%10;
            }
            s--;
            nums=n;
        }
        return nums[0];
    }
};