class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int sum=0;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(i+1<s.length()&& mp.get(curr)<mp.get(s.charAt(i+1))){
                sum-=mp.get(curr);
            }else{
                sum+=mp.get(curr);
            }
        }

        return sum;
    }
}