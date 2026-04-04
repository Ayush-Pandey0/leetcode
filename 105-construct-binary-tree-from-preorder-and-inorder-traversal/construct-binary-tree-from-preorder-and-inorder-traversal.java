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
    int preindex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,inorder.length-1);
    }
    TreeNode helper(int[] preorder,int[] inorder,int left,int right){
        if(left>right) return null;
        int rootval=preorder[preindex++];
        TreeNode root=new TreeNode(rootval);
        int breakindex=0;
        for(int i=left;i<=right;i++){
            if(inorder[i]==rootval){
                breakindex=i;
                break;
            }
        }
        root.left=helper(preorder,inorder,left,breakindex-1);
        root.right=helper(preorder,inorder,breakindex+1,right);
        return root;
    }
}