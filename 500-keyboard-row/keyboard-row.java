class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> st=new ArrayList<>();
        String first="qwertyuiop";
        String second="asdfghjkl";
        String third="zxcvbnm";

        for(String i:words){
            boolean firstcontains=true;
            for(char j:i.toCharArray()){
                if(first.indexOf(Character.toLowerCase(j))==-1){
                    firstcontains=false;
                    break;
                }
            }
            boolean secondcontains=true;
            for(char j:i.toCharArray()){
                if(second.indexOf(Character.toLowerCase(j))==-1){
                    secondcontains=false;
                    break;
                }
            }
            boolean thirdcontains=true;
            for(char j:i.toCharArray()){
                if(third.indexOf(Character.toLowerCase(j))==-1){
                    thirdcontains=false;
                    break;
                }
            }
            if(firstcontains||secondcontains||thirdcontains){
                st.add(i);
            }

        }
        int n=st.size();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=st.get(i);
        }
        return s;
    }
}