class Solution {
public:
    bool validMountainArray(vector<int>& arr) {
        if(arr.size()<3) return false;
        int p=-1;
        int c=0;
        for(int i=1;i<arr.size();i++){
            if(arr[i-1]==arr[i]){
                return false;
            }
            if(arr[i-1]<arr[i]){
                p=i;
                c++;
            }
            else
            break;
        }
        if(c==0||c==arr.size()-1) return false;
        for(int i=p+1;i<arr.size();i++){
            if(arr[i-1]>arr[i]){
                c++;
            }
        }
        if(c==arr.size()-1){
            return true;
        }
        else{
            return false;
        }
    }
};