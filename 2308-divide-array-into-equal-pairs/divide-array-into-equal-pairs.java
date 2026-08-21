class Solution {
    public boolean divideArray(int[] input) {
        int[] att= new int[501];
        int n = input.length;
        for(int i=0;i<n;i++){
           att[input[i]]++;
        }
        for(int i=0;i<att.length;i++){
          if(att[i]>0 && att[i]%2 !=0) return false;
        }
    
        return true;
    }

    
}