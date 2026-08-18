class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int count[]=new int[51];
        for(int i=0;i<=n-k;i++){
            boolean[]present=new boolean[51];
            for(int j=i;j<i+k;j++){
                present[nums[j]]=true;
            }
            for(int m=0;m<=50;m++){
                if(present[m]){
                    count[m]++;
                }
            }
        }
        for(int i=50;i>=0;i--){
            if(count[i]==1){
                return i;
            }
        }
        return -1;
    }
}