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
        TreeNode curr=root;
        if(root==null) return null;
        if(root.val==key) return helper(root); 
        while(curr!=null){
            if(key<curr.val){
                if(curr.left!=null&&key==curr.left.val){
                    curr.left=helper(curr.left);
                }
                else{
                    curr=curr.left;
                }
            }else{
                if(curr.right!=null&&key==curr.right.val){
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
        TreeNode temp=node.left;
        while(temp.right!=null){
            temp=temp.right;
        }
        temp.right=node.right;
        return node.left;
    }
}