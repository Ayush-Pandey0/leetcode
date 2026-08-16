class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int right=0;
        int n=s.length()-1;
        int count=0;
        Map<Character,Integer> mp=new HashMap<>();
        int max=0;
        while(right<=n){
            char c=s.charAt(right);
            mp.put(c,mp.getOrDefault(c,0)+1);
            while(mp.get(c)>2){
                char leftside=s.charAt(left);
                mp.put(leftside,mp.getOrDefault(leftside,0)-1);
                left++;
            }
            max=Math.max(max,right-left);
            count++;
            right++;
        }
        return max+1;
    }
}