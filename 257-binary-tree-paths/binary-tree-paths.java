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
    public void helper(List<String> l,String s,TreeNode root){
        if(root==null) return ;
        if(s.length()==0){
            s=Integer.toString(root.val);
        }
        else{
            s+="->"+Integer.toString(root.val);
        }
        if(root.left==null&&root.right==null){
            l.add(s);
        }
        helper(l,s,root.left);
        helper(l,s,root.right);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>l=new ArrayList<>();
        helper(l,"",root);
        return l;
    }
}