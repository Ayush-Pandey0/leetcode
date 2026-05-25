class Solution {
    public int compress(char[] chars) {
        // Map<Character,Integer> mp=new HashMap<>();
        // Set<Character> st=new HashSet<>();
        // for(char c:chars){
        //     mp.put(c,mp.getOrDefault(c,0)+1);
        //     st.add(c);
        // }

        String ans="";
        // for(char c:st){
        //     int v=1;
        //     ans+=c;
        //     if(mp.containsKey(c)){
        //         v=mp.get(c);
        //     }
        //     if(v>1){
        //         ans+=v+"";
        //     }
        // }
        int n=chars.length;
        int i=0;
        int j=0;
        while(j<n){
            ans+=chars[i];
            int count=0;
            while(j<n&&chars[i]==chars[j]){
                j++;
                count++;
            }
             if(count > 1) {
                ans += count;
            }

            i = j;
        }
        System.out.println(ans);
        int index=0;
        for(int m=0;m<ans.length();m++){
            chars[index++]=ans.charAt(m);
        }
        return ans.length();
        
    }
}