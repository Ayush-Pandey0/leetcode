class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int need;
        for(int i=0;i<nums.length;i++){
            need=target-nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}