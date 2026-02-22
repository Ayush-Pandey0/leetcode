class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
    }

    private int solve(int[]nums, int k){
        int  n=nums.length;
        int[] hash= new int[n+1];
        int i=0;
        int sub=0;
        
        int distint=0;

        for(int j=0;j<n;j++){
            if(hash[nums[j]]==0)
            distint++;
            hash[nums[j]]++;

            while(distint>k){
                hash[nums[i]]--;
                if(hash[nums[i]]==0)
                distint--;
                i++;
                
            }

            
            sub+=j-i+1;



        }
        return sub;
    }
}