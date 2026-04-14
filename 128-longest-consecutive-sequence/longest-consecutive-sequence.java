class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count=1;
        // for(int i:nums){
        //     System.out.println(i);
        // }
        int longest=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]) continue;
            if(nums[i-1]==nums[i]-1){
                count++;
            }else{
                longest=Math.max(longest,count);
                count=1;
            }
        }
        return Math.max(longest,count);
    }
}