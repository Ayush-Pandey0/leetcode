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
    TreeNode prev=null;
    int i=0;
    public void inorder(TreeNode root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public void put(TreeNode root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        put(root.left,ans);
        root.val=ans.get(i++);
        put(root.right,ans);
    }
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        Collections.sort(ans);
        i=0;
        put(root,ans);
        // if(root==null) return;
        // recoverTree(root.left);
        // if(prev!=null&&prev.val>root.val){
        //     int temp=prev.val;
        //     prev.val=root.val;
        //     root.val=temp;
        //     return;
        // }
        // prev=root;
        // recoverTree(root.right);
    }
}