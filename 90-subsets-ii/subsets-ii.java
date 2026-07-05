
class Solution {
    public void find(int[]nums,List<List<Integer>> ans,List<Integer>curr,int i){
        if(i==nums.length){
            if(!ans.contains(curr))
                ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        find(nums,ans,curr,i+1);
        curr.remove(curr.size()-1);
        find(nums,ans,curr,i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        find(nums,ans,curr,0);
        return ans;
    }
}