class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        int i=0;
        while(i<costs.length&&sum<coins&&costs[i]+sum<=coins){
            sum+=costs[i];
            i++;
        }
        return i;
    }
}