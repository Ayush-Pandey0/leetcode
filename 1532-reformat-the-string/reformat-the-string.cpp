class Solution {
public:
    string reformat(string s) {
        string letters, digits;
        
        // Separate letters and digits
        for (char c : s) {
            if (isalpha(c)) letters += c;
            else digits += c;
        }

        // If the difference in count > 1, not possible
        if (abs((int)letters.size() - (int)digits.size()) > 1) return "";

        string result = "";
        bool letterFirst = letters.size() > digits.size();

        int i = 0, j = 0;
        while (i < letters.size() || j < digits.size()) {
            if (letterFirst && i < letters.size()) result += letters[i++];
            if (j < digits.size()) result += digits[j++];
            if (!letterFirst && i < letters.size()) result += letters[i++];
        }
        return result;
    }
};
