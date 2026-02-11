class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int posindex=0;
        int negindex=1;
        int arr[]=new int[n];
        for(int i:nums){
            if(i>0){
                arr[posindex]=i;
                posindex+=2;
            }
            else{
                arr[negindex]=i;
                negindex+=2;
            }
        }
        return arr;
    }
}