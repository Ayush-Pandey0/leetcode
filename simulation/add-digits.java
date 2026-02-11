class Solution {
    public int addDigits(int num) {
        int sum=0;
        if(num==0) return sum;
        if(num<=9) return num;
        while(num>9){
            sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            if(sum<10) return sum;
            else num=sum;
        }
        return -1;
    }
}