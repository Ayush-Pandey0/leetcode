class Solution {
    public int maximum69Number (int num) {
        int pos=-1;
        int place=0;
        int temp=num;

        while(temp>0){
            int d=temp%10;
            if(d==6){
                pos=place;
            }
            temp=temp/10;
            place++;
        }
        if(pos!=-1){
            num+=3*Math.pow(10,pos);
        }
        return num;
    }
}