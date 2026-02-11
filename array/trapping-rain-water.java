class Solution {
    public int trap(int[] height) {
        int leftmax=0,rightmax=0,l=0,r=height.length-1;
        int water=0;
        while(l<r){
            if(height[l]<height[r]){
                leftmax=Math.max(leftmax,height[l]);
                water+=leftmax-height[l];
                l++;
            }
            else{
                rightmax=Math.max(rightmax,height[r]);
                water+=rightmax-height[r];
                r--;
            }
        }
        return water;
    }
}