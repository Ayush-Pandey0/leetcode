
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=-1;
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int []prefix=new int[n];
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            prefix[i]=min;
        }
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            if(max-prefix[i]<=k){
                return i;
            }
        }
        return -1;

    }
}