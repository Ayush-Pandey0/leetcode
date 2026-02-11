import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(k==1) return 0;
        int m=Integer.MAX_VALUE;
        for(int i=0;i+k-1<nums.length;i++){
            m=Math.min(nums[i+k-1]-nums[i],m);
        }
        return m;
    }
}
