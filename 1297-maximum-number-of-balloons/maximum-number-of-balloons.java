class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:text.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        String b="balloon";
        int ans=Integer.MAX_VALUE;
        int l=mp.getOrDefault('l',0)/2;
        int o=mp.getOrDefault('o',0)/2;

        mp.put('l',l);
        mp.put('o',o);
        for(char c:b.toCharArray()){
            if(!mp.containsKey(c)) return 0;
            ans=Math.min(ans,mp.get(c));
        }
        return ans;
    }
}