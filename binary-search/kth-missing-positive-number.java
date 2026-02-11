class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int count=1;
        int missing;
        int i=0;
        while(i<n){
            if(count!=arr[i]){
                missing=count;
                k--;
                if(k==0) return missing;
            }
            else{i++;}
            count++;
        }
        return arr[n-1]+k;
    }
}