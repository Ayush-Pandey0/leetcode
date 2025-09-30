class Solution {
public:
    bool isPalindrome(string s) {
        if(s==" ") return true;
        string s1="";
        for(char i:s){
            i=tolower(i);
            if((i>=97&&i<=122)||i>=48&&i<=57) s1+=i;
        }
        if(s1.size()==1) return true;
        int i=0,j=s1.size()-1;
        while(i<=j){
            if(s1[i]!=s1[j]) return false;
            i++;
            j--;
        }
        return true;
    }
};