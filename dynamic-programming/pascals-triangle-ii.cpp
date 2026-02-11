class Solution {
public:
    vector<int> getRow(int n) {
        vector <vector<int>> ps;

        vector<int> re;
        for(int i=0;i<=n;i++){
            vector<int> row(i+1,1);
            for(int j=1;j<i;j++){
                row[j]=ps[i-1][j-1]+ps[i-1][j];
            }
            ps.push_back(row);
            re=row;
        }

        return re;
    }
};