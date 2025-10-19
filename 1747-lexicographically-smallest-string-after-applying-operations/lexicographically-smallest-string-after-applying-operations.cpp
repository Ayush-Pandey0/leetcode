#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    string addOperation(string s, int a) {
        for (int i = 1; i < s.size(); i += 2) {
            s[i] = ((s[i] - '0' + a) % 10) + '0';
        }
        return s;
    }

    string rotateOperation(string s, int b) {
        int n = s.size();
        return s.substr(n - b) + s.substr(0, n - b);
    }

    string findLexSmallestString(string s, int a, int b) {
        queue<string> q;
        unordered_set<string> seen;
        string ans = s;

        q.push(s);
        seen.insert(s);

        while (!q.empty()) {
            string cur = q.front();
            q.pop();

            if (cur < ans)
                ans = cur;

            // Operation 1: add
            string addStr = addOperation(cur, a);
            if (!seen.count(addStr)) {
                seen.insert(addStr);
                q.push(addStr);
            }

            // Operation 2: rotate
            string rotStr = rotateOperation(cur, b);
            if (!seen.count(rotStr)) {
                seen.insert(rotStr);
                q.push(rotStr);
            }
        }
        return ans;
    }
};
