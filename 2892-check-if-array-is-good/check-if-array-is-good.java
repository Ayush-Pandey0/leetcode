class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int max = nums[n - 1];

        if (n != max + 1) {
            return false;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        return nums[n - 1] == nums[n - 2];
    }
}