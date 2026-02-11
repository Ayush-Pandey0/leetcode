class Solution {
public:
    int countCoveredBuildings(int n, vector<vector<int>>& buildings) {
        unordered_map<int, vector<int>> rows, cols;

        // Fill row → columns and col → rows
        for (auto& b : buildings) {
            int x = b[0], y = b[1];
            rows[x].push_back(y);
            cols[y].push_back(x);
        }

        // Sort lists for binary search
        for (auto& p : rows)
            sort(p.second.begin(), p.second.end());
        for (auto& p : cols)
            sort(p.second.begin(), p.second.end());

        int ans = 0;

        for (auto& b : buildings) {
            int x = b[0], y = b[1];

            auto& row = rows[x];
            auto& col = cols[y];

            // find position
            int i = lower_bound(row.begin(), row.end(), y) - row.begin();
            int j = lower_bound(col.begin(), col.end(), x) - col.begin();

            // need left + right
            if (i == 0 || i == row.size() - 1)
                continue;

            // need above + below
            if (j == 0 || j == col.size() - 1)
                continue;

            ans++;
        }

        return ans;
    }
};