class Solution {
    public int majorityElement(int[] nums) {
        int major=nums[0];
        int count=0;

        for(int i:nums){
            if(count<=0){
                major=i;
            }
            if(i==major){
                count++;
            }else{
                count--;
            }
        }
        return major;
    }
}