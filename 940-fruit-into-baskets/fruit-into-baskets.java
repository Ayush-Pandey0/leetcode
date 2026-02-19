class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=fruits.length;
        int count=0;
        int l=0;
        int r=0;
        int maxlen=0;
        while(r<n){
            int curr=fruits[r];
            mp.put(curr,mp.getOrDefault(curr,0)+1);
            while(mp.size()>2){
                mp.put(fruits[l],mp.get(fruits[l])-1);
                if(mp.get(fruits[l])==0){
                    mp.remove(fruits[l]);
                }
                l++;
            }
            maxlen=Math.max(maxlen,(r-l+1));
            r++;
        }
        return maxlen;
    }
}