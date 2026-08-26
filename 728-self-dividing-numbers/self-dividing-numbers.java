class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            boolean div=true;
            int num=i;
            while(num>0){
                int d=num%10;
                
                if(d==0||i%d!=0){
                    div=false;
                    break;
                }
                num/=10;
            }
            if(div){
                ans.add(i);
            }
        }
        return ans;
    }
}