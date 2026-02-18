class Solution {
    public int numberOfSubstrings(String s) {
        int []seen={-1,-1,-1};
        int n=s.length();
        int l=0;
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int r=0;r<n;r++){
            seen[s.charAt(r)-'a']=r;
            min=Math.min(seen[0],Math.min(seen[1],seen[2]));
            if(min!=-1){
                ans=ans+min+1;
            }
        }
        return ans;
    }
}