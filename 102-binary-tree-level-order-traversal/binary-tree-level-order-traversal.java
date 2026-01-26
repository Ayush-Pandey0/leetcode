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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null) return l;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
                TreeNode no=q.poll();
                level.add(no.val);
                if(no.left!=null) q.add(no.left); 
                if(no.right!=null) q.add(no.right); 

            }
            l.add(level);
            
        }
        
        return l;
    }
}