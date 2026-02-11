class Solution {
public:
    vector<int> findEvenNumbers(vector<int>& digits) {
        unordered_set<int> st;
        int n=digits.size();
        int num;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||j==k||i==k){
                        continue;
                    }
                    num=digits[i]*100+digits[j]*10+digits[k];
                    if(num>=100&&num%2==0){
                        st.insert(num);
                    }
                }
            }
        }
        vector<int> res;
        for (const int st : st) {
            res.push_back(st);
        }
        sort(res.begin(), res.end());
        return res;
    }
};