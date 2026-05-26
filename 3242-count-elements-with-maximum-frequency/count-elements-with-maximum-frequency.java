class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        int max=-1;
        int maxel=-1;
        for(int i:nums){
            freq[i]++;
            max=Math.max(max,freq[i]);
            maxel=Math.max(maxel,i);
        }
        if(max==-1){
            return maxel;
        }
        int sum=0;
        for(int i=0;i<=100;i++){
            if(freq[i]==max){
                sum+=max;
            }
        }
        return sum;

    }
}