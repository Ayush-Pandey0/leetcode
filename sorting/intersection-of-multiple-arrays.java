import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] count = new int[1001]; // since nums[i][j] <= 1000
        for (int[] arr : nums) {
            for (int n : arr) {
                count[n]++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            if (count[i] == nums.length) { // appears in every array
                ans.add(i);
            }
        }
        return ans;
    }
}
