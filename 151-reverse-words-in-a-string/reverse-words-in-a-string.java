class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String curr="";
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                curr=s.charAt(i)+curr;
                // System.out.println(curr);
            }else{
                int n=sb.length()-1;
                sb.append(curr);
                if(sb.charAt(sb.length()-1)!=' ')
                    sb.append(" ");
                // System.out.println(sb.toString());
                curr="";
            }
        }
        if(!curr.equals("")){
            sb.append(curr);
        }
        return sb.toString();
    }
}