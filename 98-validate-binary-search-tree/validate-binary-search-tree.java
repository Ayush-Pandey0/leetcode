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
    int ans=1;
    TreeNode prev=null;
    public void find(TreeNode root){
        if(root==null) return;
        find(root.left);
        if(prev!=null&&prev.val>=root.val){
            ans=0;
            return;
        }
        prev=root;
        find(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        find(root);
        return (ans==1)?true:false;
    }
}