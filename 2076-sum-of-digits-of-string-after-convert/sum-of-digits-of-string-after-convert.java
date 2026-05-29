class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        
        for (char c : s.toCharArray()) {
            int val= c - 'a'+1;
            if(val<=9) sum+=val;
            else{
                while(val>0){
                    int d=val%10;
                    sum+=d;
                    val/=10;
                }
            }
        }
        System.out.println(sum);
        k--;
        while(k>0){
            int c=0;
            int temp=sum;
            while(temp>0){
                int d=temp%10;
                c+=d;
                temp/=10;
            }
            System.out.println(temp);
            sum=c;
            k--;
        }

        return sum;
    }
}