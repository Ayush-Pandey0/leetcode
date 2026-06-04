class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int j=num1;j<=num2;j++){
            String s=String.valueOf(j);
            if(s.length()<3) continue;
            for(int i=1;i<s.length()-1;i++){
                if((s.charAt(i-1)<s.charAt(i)&&(s.charAt(i)>s.charAt(i+1)))||(s.charAt(i-1)>s.charAt(i)&&(s.charAt(i)<s.charAt(i+1)))){
                    ans++;
                }
            }
        }
        return ans;
    }
}