class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        int max=0;
        while(j<nums.length){
            if(nums[j]==1){
                count++;
                max=Math.max(max,count);
            }else{
                count=0;
                i=j;
            }
            j++;
        }
        return max;
    }
}