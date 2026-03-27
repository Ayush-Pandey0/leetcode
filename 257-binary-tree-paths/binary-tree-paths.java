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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        solve(root,"",ans);
        return ans;
    }
    public void solve(TreeNode node,String path,List<String> ans){
        if(node==null) return;
        if(path==""){
            path=""+node.val;
        }
        else{
            path+="->"+node.val;
        }
        if(node.left==null&&node.right==null){
            ans.add(path);
            return;
        }
        solve(node.left,path,ans);
        solve(node.right,path,ans);
    }
}