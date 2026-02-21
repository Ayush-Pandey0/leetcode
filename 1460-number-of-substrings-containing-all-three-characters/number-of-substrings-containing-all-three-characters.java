class Solution {
    public int numberOfSubstrings(String s) {
        int[] visited={-1,-1,-1};
        int n=s.length();
        int max=0;
        int ans=0;
        for(int r=0;r<n;r++){
            int curr=s.charAt(r)-'a';
            visited[curr]=r;
            if(visited[0]!=-1&&visited[1]!=-1&&visited[2]!=-1){
                int mini=Math.min(visited[0],Math.min(visited[1],visited[2]));
                ans+=mini+1;
            }
        }
        return ans;
    }
}