class Solution {
public:
    int smallestNumber(int n) {
        int k=1;
        int num=-1;
        while(num<n){
            num=pow(2,k)-1;
            k++;
        }

        return num;
    }
};