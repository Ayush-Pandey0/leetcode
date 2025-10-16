class Solution {
    public void sortColors(int[] nums) {
        int low = 0;              // next position for 0
        int mid = 0;              // current element
        int high = nums.length - 1; // next position for 2

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;  // 1 is already in correct place
            } else {
                // nums[mid] == 2 → swap with nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
