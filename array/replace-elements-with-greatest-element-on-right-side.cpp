class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int n=arr.size()-1;
        int max=-1;
        // vector <int> ans(n+1);
        // ans[n]=-1;
        for(int i=n;i>=0;i--){
            int e=arr[i];
            arr[i]=max;
            if(e>max){
                max=e;
            }
        }
        return arr;
    }
};