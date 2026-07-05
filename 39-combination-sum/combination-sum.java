class Solution {
    public void find(List<List<Integer>> ans,List<Integer>curr,int []candi,int target,int sum,int i){
        if(i==candi.length||sum>target){
            return;
        } 
        if(sum==target){
            ans.add(new ArrayList<>(curr));
            // curr.clear();
            return;
        }
        curr.add(candi[i]);
        find(ans,curr,candi,target,sum+candi[i],i);
        curr.remove(curr.size()-1);
        find(ans,curr,candi,target,sum,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int i=0;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        find(ans,curr,candidates,target,0,0);
        return ans;
    }
}