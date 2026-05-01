class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int mid=0;

        while(mid<=j){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[i];
                nums[i]=temp;
                i++; 
                mid++;  
            }else if(nums[mid]==1){
                mid++;
            } 
            else{
                int te=nums[mid];
                nums[mid]=nums[j];
                nums[j]=te;
                j--;
            }


        }

    }
}