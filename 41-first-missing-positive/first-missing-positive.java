class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]>0){
                break;
            }
            i++;
        }
        if(i==n&&nums[i-1]<=0){
            return 1;
        }
        if(i==n){
            return nums[n-1]+1;
        }
        int left=i;
        int firstel=nums[left];
        Set<Integer> st=new HashSet<>();
        for(int j=left;j<n;j++){
            st.add(nums[j]);
        }
        for(int j=1;j<nums[n-1];j++){
            if(!st.contains(j)){
                return j;
            }
        }
        return nums[n-1]+1;
    }
}