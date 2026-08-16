
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0;
        int right=0;
        int n=nums.length-1;
        int count=0;
        // int []mp=new int[26];
        Map<Integer,Integer> mp=new HashMap<>();
        int max=0;
        while(right<=n){
            int c=nums[right];
            // mp[c-]++;
            mp.put(c,mp.getOrDefault(c,0)+1);
            while(mp.get(c)>k){
                int leftside=nums[left];
                mp.put(leftside,mp.getOrDefault(leftside,0)-1);
                // mp[leftside-'a']--;
                left++;
            }
            max=Math.max(max,right-left);
            count++;
            right++;
        }
        return max+1;
    }
}