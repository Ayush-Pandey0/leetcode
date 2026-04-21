class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countl=0;
        int countr=0;
        for(char i:moves.toCharArray()){
            if(i=='L') countl++;
            else if(i=='R') countr++;
        }
        char replacement=(countl>countr)?'L':'R';

        countl=0;
        countr=0;
        for(char i:moves.toCharArray()){
            char c;
            if(i=='_')  c=replacement;
            else  c=i;

            if(c=='L') countl++;
            else if(c=='R') countr++;
        }
        return Math.abs(countl-countr);
    }
}