class Solution {
    public void recurse(List<List<Integer>> ans, List<Integer> curr,int[] nums,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        recurse(ans,curr,nums,i+1);
        curr.remove(curr.size()-1);
        recurse(ans,curr,nums,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        recurse(ans,curr,nums,0);
        return ans;
    }
}