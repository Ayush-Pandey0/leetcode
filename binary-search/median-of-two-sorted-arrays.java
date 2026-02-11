import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int []nums=new int[n];
        for(int i=0;i<nums1.length;i++){
            nums[i]=nums1[i];
        }
        int c=nums1.length;
        for(int i=0;i<nums2.length;i++){
            nums[c]=nums2[i];
            c++;
        }
        Arrays.sort(nums);
        int l=nums.length;
        if (l % 2 != 0) 
        return nums[l / 2];
    return (nums[l / 2] + nums[(l / 2) - 1]) / 2.0;

    }
}