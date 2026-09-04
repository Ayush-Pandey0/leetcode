class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            int min=Integer.MAX_VALUE;
            max=Math.max(nums[i],max);
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
                System.out.println(min);

            }
            System.out.println(max+" "+min);
            if(max-min<=k) return i;
        }
        return -1;

    }
}