class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int n = s.length();
        int j = n - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                int c=i;
                int d=j;
                i=c+1;
                while(i<j){
                    if(s.charAt(i)!=s.charAt(j)) break;
                    i++;
                    j--;
                }
                if(i>=j) return true;
                i=c;
                j=d-1;
                while(i<j){
                    if(s.charAt(i)!=s.charAt(j)) break;
                    i++;
                    j--;
                }
                return (i>=j);
            }
            i++;
            j--;
        }
        return true;
    }
}