class Solution {
    public void recurse(List<List<Integer>> ans,List<Integer> curr,int sum,int i,int [] candi,int k){
        if(i==candi.length||sum>k) return;
        if(sum==k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(candi[i]);
        recurse(ans,curr,sum+candi[i],i,candi,k);
        curr.remove(curr.size()-1);
        recurse(ans,curr,sum,i+1,candi,k);

    }
    public List<List<Integer>> combinationSum(int[] candi, int k) {
        int sum=0;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        recurse(ans,curr,sum,0,candi,k);
        return ans;

    }
}