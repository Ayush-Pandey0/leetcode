class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]+1==nums[i]){
                sum+=nums[i];
            }else{
                break;
            }
        }
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
                st.add(i);
        }
        while(st.contains(sum)){
            sum++;
        }
        return sum;

        
    }
}