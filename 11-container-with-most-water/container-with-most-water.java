class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int area=0;
        while(i<j){
            int base=j-i;
            int min=Math.min(height[i],height[j]);
            if(area<base*min){
                area=base*min;
            }
            if(height[i]>=height[j]) j--;
            else i++;
            // (height[i]<=height[j])?i++:j--;
        }
        return area;
    }
}