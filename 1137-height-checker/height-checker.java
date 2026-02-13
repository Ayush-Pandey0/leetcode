class Solution {
    public void sortb(int[] heights){
        for(int i=0;i<heights.length;i++){
            int smallest=i;
            for(int j=i+1;j<heights.length;j++){
                if(heights[j]<heights[smallest]){
                    smallest=j;
                }
            }
            int temp=heights[smallest];
            heights[smallest]=heights[i];
            heights[i]=temp;
        }
    }
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int []ans=heights.clone();
        // for(int i=0;i<n;i++){
        //     ans[i]=heights[i];
        // }
        sortb(ans);
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]==ans[i]) continue;
            count++;
        }
        return count;
    }
}