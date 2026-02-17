class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int []seen={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            seen[s.charAt(i)-'a']=i;
            int minindex = Math.min(seen[0], Math.min(seen[1], seen[2]));
            if(minindex!=-1){
                count+=minindex+1;
            }
        }
        return count;
    }
}