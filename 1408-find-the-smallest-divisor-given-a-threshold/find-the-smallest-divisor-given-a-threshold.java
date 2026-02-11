class Solution {
    public int calculate(int[] nums, int mid) {
        int sum = 0;
        for (int i : nums) {
            sum += (i + mid - 1) / mid;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = -1;
        for (int i : nums) {
            high = Math.max(high, i);
        }
        int sum = 0;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            sum = calculate(nums, mid);
            if (sum <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }
}