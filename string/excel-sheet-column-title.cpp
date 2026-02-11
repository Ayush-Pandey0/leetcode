class Solution {
public:
    string convertToTitle(int a) {
        string s = "";
        while (a > 0) {
            a--; 
            int rem = a % 26;
            s = char('A' + rem) + s;
            a /= 26;
        }
        return s;
    }
};