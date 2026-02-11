class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        queue<int> q;
        int count=0;
        int n=students.size();
        for(int i=0;i<n;i++){
            q.push(students[i]);
        }
        int i=0;
        while(q.size()>0&&count!=q.size()){
            int qe = q.front();
            q.pop();
            if(qe ==sandwiches[i]){
                i++;
                count=0;
                
            
            }
            else{
                q.push(qe);
                count++;

            }
        }
        return count;
    }
};