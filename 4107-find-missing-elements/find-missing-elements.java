class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        boolean arr[]=new boolean[101];
        for(int i:nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
            arr[i]=true;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(arr[i]==false){
                ans.add(i);
            }
        }
        return ans;
    }
}