class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length < 2) return true;
        boolean in = false;
        boolean de = false;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] < nums[i]) de = true;
            else if (nums[i + 1] > nums[i]) in = true;
            else continue;

            if(de && in) return false;
        }

        return true;
    }
}