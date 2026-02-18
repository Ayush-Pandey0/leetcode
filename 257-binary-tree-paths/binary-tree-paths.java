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
    public void helper(List<String> l,StringBuilder s,TreeNode root){
        if(root==null) return ;
        int len=s.length();
        if(s.length()==0){
            s.append(root.val);
        }
        else{
            s.append("->").append(root.val);
        }
        if(root.left==null&&root.right==null){
            l.add(s.toString());
        }
        helper(l,s,root.left);
        helper(l,s,root.right);
        s.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>l=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        helper(l,sb,root);
        return l;
    }
}