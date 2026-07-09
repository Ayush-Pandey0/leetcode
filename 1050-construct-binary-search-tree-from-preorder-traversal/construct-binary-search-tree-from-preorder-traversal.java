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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        TreeNode temp=root;
        for(int i=1;i<preorder.length;i++){
            build(temp,preorder[i]);
        }
        return root;
    }
    public TreeNode build(TreeNode temp,int val){
        if(temp==null){
            return new TreeNode(val);
        }
        if(temp.val<val){
            temp.right=build(temp.right,val);
        }else{
            temp.left=build(temp.left,val);
        }
        return temp;
    }
}