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
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode curr=root;
        List<Integer> ans=new ArrayList<>();
        while(curr!=null){
            if(curr.left==null){
                ans.add(curr.val);
                curr=curr.right;
            }else{
                TreeNode pred=curr.left;
                while(pred.right!=null&&pred.right!=curr){
                    pred=pred.right;
                }
                if(pred.right==null){
                    pred.right=curr;
                    ans.add(curr.val);
                    curr=curr.left;
                }else{
                    pred.right=null;
                    curr=curr.right;
                }
            }
        }
        return ans;
    }
}