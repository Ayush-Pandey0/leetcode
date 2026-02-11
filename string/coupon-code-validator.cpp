class Solution {
public:
    bool validCode(string &s) {
        if (s.empty()) return false;
        for (char c : s) {
            if (!isalnum(c) && c != '_')
                return false;
        }
        return true;
    }

    vector<string> validateCoupons(vector<string>& code,
                                   vector<string>& businessLine,
                                   vector<bool>& isActive) {

        unordered_map<string, vector<string>> mp;
        set<string> validBL = {"electronics", "grocery", "pharmacy", "restaurant"};

        int n = code.size();
        for (int i = 0; i < n; i++) {
            if (!isActive[i]) continue;
            if (!validCode(code[i])) continue;
            if (validBL.count(businessLine[i]) == 0) continue;

            mp[businessLine[i]].push_back(code[i]);
        }

        vector<string> order = {"electronics", "grocery", "pharmacy", "restaurant"};
        vector<string> ans;

        for (auto &b : order) {
            auto &v = mp[b];
            sort(v.begin(), v.end());
            for (auto &x : v) ans.push_back(x);
        }

        return ans;
    }
};
