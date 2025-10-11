class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low = 0, mid = 0, high = nums.size() - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {          // red
                swap(nums[low], nums[mid]);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {     // white
                mid++;
            }
            else {                         // blue
                swap(nums[mid], nums[high]);
                high--;
            }
        }
    }
};
