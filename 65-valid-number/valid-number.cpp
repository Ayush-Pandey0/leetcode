class Solution {
public:
    bool isNumber(string s) {
        int n = s.size();
        bool seenDigit = false;
        bool seenDot = false;
        bool seenE = false;
        bool digitAfterE = true; // initially true

        for (int i = 0; i < n; i++) {
            char c = s[i];

            if (isdigit(c)) {
                seenDigit = true;
                if (seenE) digitAfterE = true;
            } else if (c == '+' || c == '-') {
                // valid only at start or right after 'e'
                if (i > 0 && s[i-1] != 'e' && s[i-1] != 'E') return false;
            } else if (c == '.') {
                if (seenDot || seenE) return false;
                seenDot = true;
            } else if (c == 'e' || c == 'E') {
                if (seenE || !seenDigit) return false;
                seenE = true;
                digitAfterE = false; // need digits after e
            } else {
                return false; // invalid character
            }
        }

        return seenDigit && digitAfterE;
    }
};
