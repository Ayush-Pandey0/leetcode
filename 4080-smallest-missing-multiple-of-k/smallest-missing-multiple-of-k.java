class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        int j=1;
        for(int i=1;i<=nums.length;i++){
            if(!st.contains(i*k)){
                return i*k;
            }
            j=i;
        }
        return (j+1)*k;
    }
}