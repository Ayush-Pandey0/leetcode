class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int fin=nums1.length-1;
        while(j>=0){
            if(i>=0&&nums1[i]>=nums2[j]){
                nums1[fin]=nums1[i];
                System.out.println(nums1[fin]);
                i--;
            }else{
                nums1[fin]=nums2[j];
                System.out.println(nums2[j]);
                j--;
            }
            fin--;
        }
        
    }
}