class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                int lastind=mp.get(nums[i]);
                if(Math.abs(i-lastind)<=k){
                    return true;
                }
            }
            mp.put(nums[i],i);
        }
        return false;
    }
}