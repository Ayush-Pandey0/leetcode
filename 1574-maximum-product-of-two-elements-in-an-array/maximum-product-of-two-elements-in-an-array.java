class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int secondmax=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num>max){
                secondmax=max;
                max=num;  
            }else if(num>secondmax){
                secondmax=num;
            }
        }
        return (max-1)*(secondmax-1);
    }
}