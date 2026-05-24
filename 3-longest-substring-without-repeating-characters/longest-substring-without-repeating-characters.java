class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        int i=0;
        int j=0;
        int max=0;
        while(j<n){
            char curr=s.charAt(j);
            mp.put(curr,mp.getOrDefault(curr,0)+1);

            while(mp.get(curr)>1){
                char f=s.charAt(i);
                mp.put(f,mp.get(f)-1);
                if(mp.get(f)==0){
                    mp.remove(f);
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;

        }
        return max;
    }
}