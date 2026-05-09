class Solution {
    public List<Integer> getRow(int rowIndex) {
        int row=0;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            ArrayList<Integer> level=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    level.add(1);
                }else{
                    int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    level.add(val);
                }
            }
            ans.add(level);
            
        }

        return ans.get(rowIndex);
    }
}