class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                ind=i;
            }
        }
        if(ind!=-1)
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int d=nums[ind];
                nums[ind]=nums[i];
                nums[i]=d;
                break;
            }
        }
        int start=ind+1;
        int high=n-1;
        while(start<=high){
            int f=nums[start];
            nums[start]=nums[high];
            nums[high]=f;
            start++;
            high--;
        }

    }
}