class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(st.isEmpty()&&(c==')'||c==']'||c=='}')) return false;
            if(c=='('||c=='['||c=='{'){
                st.add(c);
            }
            else if(!st.isEmpty()){
                char top=st.pop();
                if(top=='('&&c==')'){
                    continue;
                }else if(top=='['&&c==']'){
                    continue;
                }else if(top=='{'&&c=='}'){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return (st.isEmpty())?true:false;
    }
}