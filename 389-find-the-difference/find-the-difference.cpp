class Solution {
public:
    char findTheDifference(string s, string t) {
        char res = 0;
        for (char ch : s) res ^= ch;  // XOR all chars in s
        for (char ch : t) res ^= ch;  // XOR all chars in t
        return res;                   // remaining char is the extra one
    }
};
