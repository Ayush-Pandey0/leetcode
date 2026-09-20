class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int rev=(('z'-s.charAt(i))%26)+1;
            System.out.println(rev);
            ans+=(rev*(i+1));
        }
        return ans;
    }
}