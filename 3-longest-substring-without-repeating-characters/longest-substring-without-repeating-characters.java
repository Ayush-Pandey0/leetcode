class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h=new HashSet<>();
        int l=0;
        int r=0;
        int n=s.length()-1;
        int maxlen=0;
        while(r<=n){
            while(h.contains(s.charAt(r))){
                h.remove(s.charAt(l));
                l++;
            }
            h.add(s.charAt(r));
            r++;
            maxlen=Math.max(maxlen,r-l);
        }
        return maxlen;
    }
}