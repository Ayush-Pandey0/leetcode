/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void level(List<Integer> ans, int level,TreeNode root) {
        if (root == null)
            return;
        if(ans.size()==level) ans.add(root.val);
        level(ans,level+1,root.right);
        level(ans,level+1,root.left);
        return;
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        level(ans, 0,root);
        return ans;
    }
}