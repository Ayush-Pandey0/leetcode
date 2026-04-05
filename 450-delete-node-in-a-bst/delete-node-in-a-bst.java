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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        TreeNode curr=root;
        if(root.val==key) return helper(root);
        while(curr!=null){
            if(key<curr.val){
                if(curr.left!=null&&curr.left.val==key){
                    curr.left=helper(curr.left);
                }else{
                    curr=curr.left;
                }
            }
            else{
                if(curr.right!=null&&curr.right.val==key){
                    curr.right=helper(curr.right);
                }else{
                    curr=curr.right;
                }
            }
        }
        return root;
    }
    TreeNode helper(TreeNode node){
        if(node.left==null) return node.right;
        if(node.right==null) return node.left;
        TreeNode curr=node.left;
        while(curr.right!=null){
            curr=curr.right;
        }
        curr.right=node.right;
        return node.left;
    }
}