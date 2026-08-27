class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int i = 0;
        int j = 0;
        Map<Character,Integer> mp=new HashMap<>();
        while (j < s.length()) {
            char c = s.charAt(j);
            mp.put(c,mp.getOrDefault(c,0)+1);
            while (mp.get(c) > 1) {
                char m = s.charAt(i);
                mp.put(m,mp.getOrDefault(m,0)-1);
                i++;
            }
            count=Math.max(count,j-i+1);
            j++;
        }
        return count;
    }
}