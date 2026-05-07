class Solution {
public:
    string removeOuterParentheses(string s) {
        int count=0;
        string ans="";

        for(char c:s){
            if(c=='('){
                if(count>0){
                    ans+=c;
                }
                count++;
            }else{
                if(count>1){
                    ans+=c;
                }
                count--;
            }
        }
        return ans;
    }
};