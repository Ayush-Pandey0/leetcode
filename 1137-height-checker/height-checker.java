class Solution {
    public void sortb(int[] heights){
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights.length-i-1;j++){
                if(heights[j]>heights[j+1]){
                    int temp=heights[j+1];
                    heights[j+1]=heights[j];
                    heights[j]=temp;
                }
            }
        }
    }
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=heights[i];
        }
        sortb(ans);
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=ans[i]) count++;
        }
        return count;
    }
}