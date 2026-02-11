class Solution {
public:
    int minAddToMakeValid(string s) {
        stack<int> st;
        int count=0;
        for(char i:s){
            if(i=='('){
                st.push(i);
            }
            else{
                if(!st.empty())
                st.pop();
                else
                count++;
            }
        }
        return st.size()+count;
    }
};