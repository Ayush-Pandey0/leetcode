class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n=nums.size();
        int s=0;
        int pos=0;
        for(int i=0;i<n;i++){
            if(nums[i]){
                nums[s]=nums[i];
                
                s++;
            }
        }
        for(int j=s;j<n;j++){
            nums[j]=0;
        }

    }
};