class Solution {
    public long removeZeros(long n) {
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='0'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        long l=Long.parseLong(sb.toString());
        return l;

    }
}