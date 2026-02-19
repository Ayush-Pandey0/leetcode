class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        int maxlen=0;
        int l=0;
        int r=0;
        while(r<n){
            char c=s.charAt(r);
            mp.put(c,mp.getOrDefault(c,0)+1);
            while(mp.get(s.charAt(r))>1){
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                if(mp.get(s.charAt(l))==0){
                    mp.remove(s.charAt(l));
                }
                l++;
            }
            maxlen=Math.max(maxlen,(r-l+1));
            r++;
        }
        return maxlen;
    }
}