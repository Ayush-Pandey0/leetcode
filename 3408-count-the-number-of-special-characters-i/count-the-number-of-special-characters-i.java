class Solution {
    public int numberOfSpecialChars(String word) {
        boolean low[]=new boolean[26];
        boolean high[]=new boolean[26];

        for(char c:word.toCharArray()){
            if(c>='a'&&c<='z'){
                low[c-'a']=true;
            }else{
                high[c-'A']=true;
            }
        }
        int ans=0;
        for(int i=0;i<26;i++){
            if(low[i]==true&&high[i]==true){
                ans++;
            }
        }
        return ans;
    }
}