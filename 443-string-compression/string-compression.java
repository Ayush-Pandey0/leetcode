class Solution {
    public int compress(char[] chars) {
        String ans="";
        int n=chars.length;
        int i=0;
        int j=0;
        while(j<n){
            ans+=chars[i];
            int count=0;
            while(j<n&&chars[i]==chars[j]){
                j++;
                count++;
            }
            if(count > 1) {
                ans += count;
            }
            i = j;
        }
        System.out.println(ans);
        int index=0;
        for(int m=0;m<ans.length();m++){
            chars[index++]=ans.charAt(m);
        }
        return ans.length();
        
    }
}