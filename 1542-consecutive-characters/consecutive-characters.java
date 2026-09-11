class Solution {
    public int maxPower(String s) {
        int count=1;
        int ans=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                ans=Math.max(count,ans);
            }else{
                count=1;
            }
        }
        return ans;
    }
}