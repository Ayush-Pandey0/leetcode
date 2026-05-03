class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int k=0;
        while(i<t.length()&&k<s.length()){
            if(s.charAt(k)==t.charAt(i)){
                k++;
            }
                i++;
            
        }
        if(k==s.length()) return true;
        return false;
        
    }
}