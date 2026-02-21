class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return faah(nums,k)-faah(nums,k-1);
    }
    public int faah(int[] nums,int k){
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0) nums[i]=0;
            else nums[i]=1;
        }

        int l=0;
        int r=0;
        int odd=0;
        int ans=0;
        while(r<n){
            odd+=nums[r];
            while(odd>k){
                odd-=nums[l];
                l++;
            }
            ans+=(r-l+1);
            r++;
        }
        return ans;

    }
}