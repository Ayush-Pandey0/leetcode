class Solution {
    public int numberOfSpecialChars(String word) {
        int low[]=new int[26];
        int high[]=new int[26];
        Arrays.fill(low,-1);
        Arrays.fill(high,-1);
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                low[c-'a']=i;
            }else{
                if(high[c-'A']==-1){
                    high[c-'A']=i;
                }
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(low[i]!=-1&&high[i]!=-1&&low[i]<high[i]){
                count++;
            }
        }
        return count;
    }
}