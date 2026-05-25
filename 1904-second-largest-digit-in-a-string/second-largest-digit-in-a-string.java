class Solution {
    public int secondHighest(String s) {
        int largest=-1;
        int secondlargest=-1;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c>='0'&&c<='9'){
                int m=c-'0';

                if(m>largest){
                    secondlargest=largest;
                    largest=m;
                }else if(m!=largest&&m>secondlargest){
                    secondlargest=m;
                }
            }
        }
        return secondlargest;

    }
}