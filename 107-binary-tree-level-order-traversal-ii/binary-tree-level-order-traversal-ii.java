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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> l=new ArrayList<>();
        if(root==null) return l;
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int s=q.size();

            for(int i=0;i<s;i++){
                TreeNode node=q.poll();
                level.add(node.val);

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);

            }
            l.addFirst(level);
        }
        // Collections.reverse(l);
        return l;
    }
}