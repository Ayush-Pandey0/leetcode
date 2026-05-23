class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int n=nums.length;
        int count=0;
        int curr=0;
        for(int i=0;i<n;i++){
            curr+=nums[i];

            if(mp.containsKey(curr-k)){
                count+=mp.get(curr-k);
            }
            mp.put(curr,mp.getOrDefault(curr,0)+1);
        }
        return count;
    }
}