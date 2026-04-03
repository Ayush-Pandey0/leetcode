/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void markparent(TreeNode root, Map<TreeNode, TreeNode> parent) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.add(node.left);
                    parent.put(node.left,node);
                }
                if (node.right != null) {
                    q.add(node.right);
                    parent.put(node.right,node);
                }
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        markparent(root,parent);

        Set<TreeNode> visited = new HashSet<>();
         visited.add(target);

        Queue<TreeNode> q=new LinkedList<>();
        q.add(target);
        int distance=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(distance==k) break;
            distance++;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null&&!visited.contains(curr.left)){
                    q.offer(curr.left);
                    visited.add(curr.left);
                }
                if(curr.right!=null&&!visited.contains(curr.right)){
                    q.offer(curr.right);
                    visited.add(curr.right);
                }
                if(parent.get(curr)!=null&&!visited.contains(parent.get(curr))){
                    q.offer(parent.get(curr));
                    visited.add(parent.get(curr));
                }
            }
        }

        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
}