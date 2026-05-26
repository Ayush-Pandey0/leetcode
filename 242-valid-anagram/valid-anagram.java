class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        int i=0;
        int j=0;

        while(i<n&&j<m){
            char schar=s.charAt(i);
            char tchar=t.charAt(j);
            freq[schar-'a']++;
            freq[tchar-'a']--;
            i++;
            j++;

        }

        for(int mc:freq){
            if(mc>0) return false;
        }
        return true;
    }
}