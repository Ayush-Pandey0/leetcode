class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        int left=0;
        int right=n-1;
        int ind=n-1;
        while(left<=right){
            int leftsquare=nums[left]*nums[left];
            int rightsquare=nums[right]*nums[right];

            if(leftsquare>rightsquare){
                ans[ind]=leftsquare;
                left++;
            }else{
                ans[ind]=rightsquare;
                right--;
            }
            ind--;
        }
        return ans;
    }
}