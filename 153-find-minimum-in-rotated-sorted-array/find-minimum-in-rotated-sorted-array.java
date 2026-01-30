class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            mini=Math.min(mini,nums[mid]);
            if(nums[mid]>=nums[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return mini;
    }
}