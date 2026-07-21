class Solution {
    public void find(List<List<Integer>> ans, List<Integer> curr, int[] candi, int target, int sum, int i) {
        if (sum == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (i == candi.length || sum > target)
            return;
            
        curr.add(candi[i]);
        find(ans, curr, candi, target, sum + candi[i], i + 1);
        curr.remove(curr.size() - 1);
        while (i + 1 < candi.length && candi[i] == candi[i + 1]) {
            i++;
        }
        find(ans, curr, candi, target, sum, i + 1);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int i = 0;
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        find(ans, curr, candidates, target, 0, 0);
        return ans;
    }
}