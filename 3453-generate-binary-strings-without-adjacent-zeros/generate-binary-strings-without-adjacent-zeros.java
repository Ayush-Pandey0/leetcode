class Solution {
    void find( List<String> s,int n,int i,String curr){
        if(i==n){
            s.add(curr);
            return;
        }
        find(s,n,i+1,curr+"1");
        int size=curr.length();
        if(i==0||curr.charAt(size-1)!='0'){
            find(s,n,i+1,curr+"0");
        }
    }
    public List<String> validStrings(int n) {
        List<String> s=new ArrayList<>();
        find(s,n,0,"");
        return s;
    }
}