class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String ans="";
        String curr="";

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(!curr.equals("")){
                    ans+=curr+" ";
                    curr="";
                }
            }else{
                curr=s.charAt(i)+curr;
            }
        }
        ans+=curr;
        return ans;
    }
}