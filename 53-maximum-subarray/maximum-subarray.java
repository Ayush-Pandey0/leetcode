class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=Math.max(nums[i],ans+nums[i]);
            max=Math.max(ans,max);
        }
        return max;
    }
}