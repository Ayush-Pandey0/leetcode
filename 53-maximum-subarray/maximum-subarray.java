class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int curr=nums[0];
        for(int i:nums){
            sum+=i;
            curr=Math.max(sum,curr);
            if(sum<0) sum=0;
            
        }
        return curr;
    }
}