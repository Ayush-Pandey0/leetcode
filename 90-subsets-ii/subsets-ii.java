
class Solution {
    public void recurse(List<List<Integer>> ans, List<Integer> curr,int[] nums,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        recurse(ans,curr,nums,i+1);
        curr.remove(curr.size()-1);
        while(i+1 < nums.length && nums[i] == nums[i+1])
            i++;
        recurse(ans,curr,nums,i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        recurse(ans,curr,nums,0);
        return ans;
    }
}