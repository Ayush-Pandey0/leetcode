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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        traversal(root);
        return max;
    }

    int traversal(TreeNode node){
        if (node == null){
            return 0;
        }

        int left = Math.max(0, traversal(node.left));
        int right = Math.max(0, traversal(node.right));
        max = Math.max(max, node.val + left + right);

        return node.val + Math.max(left, right);
    }
}