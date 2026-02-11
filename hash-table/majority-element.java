class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int number=0;
        for(int i:nums){
            if(count==0){
                number=i;

            }
            if(number==i){
                count++;
            }
            else{
                count--;
            }
        }
        return number;
    }
}