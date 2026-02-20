class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash=new int[26];
        int maxlen=0;
        int maxfreq=0;
        int l=0;
        int r=0;
        int n=s.length();
        while(r<n){
            char curr=s.charAt(r);
            hash[curr-'A']++;
            maxfreq=Math.max(maxfreq,hash[curr-'A']);
            while((r-l+1)-maxfreq>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,(r-l+1));
            r++;
        }
        return maxlen;

    }
}