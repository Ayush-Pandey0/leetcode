class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k==n) return;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    void reverse(int nums[],int start,int right){
        while(start<=right){
            int temp=nums[right];
            nums[right]=nums[start];
            nums[start]=temp;
            start++;
            right--;
        }
    }
}