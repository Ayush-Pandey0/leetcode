class Solution {
public:
    vector<vector<int>> generate(int n) {
        vector<vector <int>> ps;
        for(int i=0;i<n;i++){
            vector<int> col(i+1,1);
            for(int j=1;j<i;j++){
                col[j]=ps[i-1][j-1]+ps[i-1][j];
            }
            ps.push_back(col);
        }
        return ps;
    }
};