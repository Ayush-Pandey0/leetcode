class Solution {
    public boolean hasAlternatingBits(int n) {
        int toggle = 1;
        String s = "";
        while (n > 0) {
            s = (n % 2) + s;
            n /= 2;
        }
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')!=toggle){
                return false;
            }
            toggle=(toggle==1)?0:1;
        }
        return true;
    }
}