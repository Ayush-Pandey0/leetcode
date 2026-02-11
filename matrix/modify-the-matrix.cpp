class Solution {
public:
    vector<vector<int>> modifiedMatrix(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();

        // Step 1: Find max element in each column
        vector<int> colMax(n, 0);
        for (int j = 0; j < n; j++) {
            int mx = 0;
            for (int i = 0; i < m; i++) {
                mx = max(mx, matrix[i][j]);
            }
            colMax[j] = mx;
        }

        // Step 2: Replace -1 with column max
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1)
                    matrix[i][j] = colMax[j];
            }
        }

        return matrix;
    }
};
