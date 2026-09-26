class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        HashMap<String,String> mp=new HashMap<>();
        for(List<String> sm:knowledge){
            mp.put(sm.get(0),sm.get(1));
        }
        
        while(j<s.length()){
            if(s.charAt(j)!='('&&s.charAt(j)!=')'){
                sb.append(s.charAt(j));
            }else{
                i=j;
                j++;
                StringBuilder sm=new StringBuilder();
                while(s.charAt(j)!=')'){
                    sm.append(s.charAt(j));
                    j++;
                }
                // System.out.println(sm.toString());
                if(mp.containsKey(sm.toString()))
                    sb.append(mp.get(sm.toString()));
                else 
                   sb.append("?") ;
            }
            j++;
        }
        return sb.toString();

    }
}