class Solution {
    public void duplicateZeros(int[] arr) {
        int ans[]=new int[arr.length];
        Arrays.fill(ans,0);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(j>=arr.length) break;
            if(arr[i]==0){
                j+=2;
            }else{
                ans[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
}