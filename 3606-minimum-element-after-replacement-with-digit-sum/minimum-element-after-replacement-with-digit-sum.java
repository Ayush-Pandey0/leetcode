class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int num=nums[i];
            int curr=0;
            while(num>0){
                int d=num%10;
                curr+=d;
                num/=10;
            }
            nums[i]=curr;
            small=Math.min(nums[i],small);
        }
        return small;
    }
}