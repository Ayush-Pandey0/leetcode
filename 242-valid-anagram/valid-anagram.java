class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            int c1=s.charAt(i)-'a';
            int c2=t.charAt(i)-'a';
            arr[c1]++;
            arr[c2]--;
        }

        for(int i:arr){
            if(i!=0) return false;
        }
        return true;
    }
}