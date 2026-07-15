class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=0;
        int odd=0;
        int c=1;
        for(int i=0;i<n;i++){
            odd+=c;
            c+=2;
        }
         c=2;
        for(int i=0;i<n;i++){
            even+=c;
            c+=2;
        }
        int ans=1;
        int small=(odd<even)?odd:even;
        for(int i=2;i<=small;i++){
            if(odd%i==0&&even%i==0){
                ans=i;
            }
        }
        return ans;
    }
}