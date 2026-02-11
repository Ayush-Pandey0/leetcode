class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        int maxdiv = 1; // start from 1 (GCD can't be less than 1)
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                maxdiv = i; // update whenever we find a common divisor
            }
        }
        return maxdiv;
    }
}