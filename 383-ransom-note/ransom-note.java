class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char c:ransomNote.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char c:magazine.toCharArray()){
            if(mp.containsKey(c))
                mp.put(c,mp.getOrDefault(c,0)-1);
        }
        for(char c:mp.keySet()){
            if(mp.get(c)>0) return false;
        }
        return true;
    }
}