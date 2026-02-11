class Solution {
    public void rotate(int[] nums, int k) {
        // int size=nums.length;
        // int temp;
        
        // while(k>0){
        //      temp=nums[size-1];
        //     for(int i=size-1;i>0;i--){
        //         nums[i]=nums[i-1];
        //     }
        //     nums[0]=temp;
        //     k--;
        // }

        int size = nums.length;
        int []arr = new int[size];
        int index = 0;
        k = k%size;
        for(int i=size-k;i<size;i++){
            arr[index] = nums[i];
            index++;
        }
        for(int i=0;i<size-k;i++){
            arr[index] = nums[i];
            index++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
    
    }
}