class Solution {
    public int numberOfSubstrings(String s) {
        int seen[]={-1,-1,-1};
        int ans=0;
        int n=s.length();
        int mini=0;
        for(int r=0;r<n;r++){
            seen[s.charAt(r)-'a']=r;
            mini=Math.min((seen[0]),Math.min(seen[1],seen[2]));
            if(mini!=-1){
                ans+=mini+1;
            }
        }
        return ans;
    }
}