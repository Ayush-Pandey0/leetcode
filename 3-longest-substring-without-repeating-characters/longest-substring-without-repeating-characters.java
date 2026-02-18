class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        int l = 0;
        Map<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        int r = 0;
        while (r < n) {
            mp.put(s.charAt(r), mp.getOrDefault(s.charAt(r), 0) + 1);
            if (mp.size() >= (r - l + 1))
                maxlen = Math.max(maxlen, (r - l + 1));
            while (mp.size() < (r - l + 1)) {
                mp.put(s.charAt(l), mp.get(s.charAt(l)) - 1);
                if (mp.get(s.charAt(l)) == 0) {
                    mp.remove(s.charAt(l));
                }
                l++;
            }
            r++;

        }
        return maxlen;
    }
}