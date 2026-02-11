class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findfirst(nums,target);
        int last=findlast(nums,target);
        return new int[]{first,last};
    }
    int findfirst(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(target<=nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    int findlast(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(target<=nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;

    }
}