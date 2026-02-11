class Solution {
    public int findNumbers(int[] arr) {
        int count=0;
        for(int i:arr){
            int c=0;
            int n=i;
            while(n>0){
                c++;
                n/=10;
            }
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
}