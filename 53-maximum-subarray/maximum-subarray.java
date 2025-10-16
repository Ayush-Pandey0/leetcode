class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];      // current subarray sum
        int maxSum = nums[0];   // maximum subarray sum
        
        for (int i = 1; i < nums.length; i++) {
            // if sum becomes smaller than nums[i], start new subarray
            sum = Math.max(nums[i], sum + nums[i]);
            // update maxSum if current sum is greater
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}
