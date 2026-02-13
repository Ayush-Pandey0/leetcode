class Solution {
    public void sorting(int[] nums,int low,int mid,int high){
        int[] temp=new int[high-low+1];

        int i=low;
        int j=mid+1;

        int count=0;
        while(i<=mid&&j<=high){
            if(nums[i]<=nums[j]){
                temp[count]=nums[i];
                i++;
            }
            else{
                temp[count]=nums[j];
                j++;
            }
            count++;
        }
        while(i<=mid){
            temp[count]=nums[i];
            i++;
            count++;
        }
        while(j<=high){
            temp[count]=nums[j];
            j++;
            count++;
        }


        for(int m=low;m<=high;m++){
            nums[m]=temp[m-low];
        }
    }

    public void merges(int[] nums, int low, int high) {
        if (low >= high)
            return;
        int mid = low + (high - low) / 2;
        merges(nums, low, mid);
        merges(nums, mid + 1, high);

        sorting(nums, low, mid, high);
    }

    public int[] sortArray(int[] nums) {
        merges(nums, 0, nums.length - 1);
        return nums;
    }
}