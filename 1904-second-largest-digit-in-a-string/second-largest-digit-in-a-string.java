class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int secondmax=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int num=ch-'0';
                if(num>max){
                    secondmax=max;
                    max=num;
                }else if(num>secondmax&&num!=max){
                    secondmax=num;
                }
            }
        }
        return secondmax;
    }
}