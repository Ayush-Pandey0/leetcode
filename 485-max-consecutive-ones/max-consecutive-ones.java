class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr++;
                sum=Math.max(sum,curr);
            }
            else{
                curr=0;
            }
        }
        return sum;
    }
}