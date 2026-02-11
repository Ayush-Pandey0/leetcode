class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int toggle = 0;
        int idx = 0;   // controls x and y index

        for (int i = 0; i < 2 * n; i++) {
            if (toggle == 0) {
                ans[i] = nums[idx];
                toggle = 1;
            } else {
                ans[i] = nums[idx + n];
                toggle = 0;
                idx++;   // move to next pair
            }
        }
        return ans;
    }
}
