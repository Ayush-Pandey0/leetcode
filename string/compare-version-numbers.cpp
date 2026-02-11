class Solution {
public:
    int compareVersion(string version1, string version2) {
        int n=version1.size();
        int m=version2.size();
        int i=0,j=0;
        while(i<n||j<m){
            long d1=0,d2=0;
            while(i<n&&version1[i]!='.'){
                d1=d1*10+(version1[i]-'0');
                i++;
            }
            while(j<m&&version2[j]!='.'){
                d2=d2*10+(version2[j]-'0');
                j++;
            }
            if(d1<d2) return -1;
            if(d1>d2) return 1;
            i++;j++;
            
        }
        return 0;
    }
};