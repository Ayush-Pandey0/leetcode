class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0;
        int r=0;
        int u=0;
        for(char i:moves.toCharArray()){
            if(i=='L') l++;
            else if(i=='R') r++;
            else u++;
        }
        return Math.abs(l-r)+u;
    }
}