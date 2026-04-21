class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;

        for(char i:moves.toCharArray()){
            if(i=='L') x--;
            else if(i=='R') x++;
            else if(i=='U') y++;
            else y--;
        }
        return x==0&&y==0;
    }
}