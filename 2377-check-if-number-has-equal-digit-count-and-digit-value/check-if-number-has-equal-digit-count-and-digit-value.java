class Solution {
    public boolean digitCount(String num) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(char i:num.toCharArray()){
            mp.put(i-'0',mp.getOrDefault(i-'0',0)+1);
        }
        for(int i=0;i<num.length();i++){
            if(mp.getOrDefault(i,0)!=num.charAt(i)-'0') return false;
        }
        return true;
    }
}