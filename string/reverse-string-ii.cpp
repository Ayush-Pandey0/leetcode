class Solution {
public:
    string reverseStr(string s, int k) {
        if (s.size() == 0) return "";
        if (s.size() == 1) return s;  // only one character, no need to reverse

        for (int i = 0; i < s.size(); i += 2 * k) {
            int n = i;
            int m = i + k;
            
            // ensure m does not go out of bounds
            if (m > s.size()) {
                m = s.size();
            }

            while (n < m) {
                char mc = s[n];
                s[n] = s[m - 1];
                s[m - 1] = mc;
                n++;
                m--;
            }

            cout << s << endl;  // debug output
        }
        return s;
    }
};
