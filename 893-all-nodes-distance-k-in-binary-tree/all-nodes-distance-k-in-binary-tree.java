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
    void buildparent(TreeNode root, Map<TreeNode, TreeNode> parent) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.left != null) {
                parent.put(node.left, node);
                q.offer(node.left);
            }
            if (node.right != null) {
                parent.put(node.right, node);
                q.offer(node.right);
            }
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();

        Map<TreeNode, TreeNode> parent = new HashMap<>();
        buildparent(root, parent);

        Set<TreeNode> visited = new HashSet<>();
        visited.add(target);

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);

        int distance = 0;
        while (!q.isEmpty()) {
            if(distance==k) break;
            int size=q.size();
            
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(node.left!=null&&!visited.contains(node.left)){
                    q.offer(node.left);
                    visited.add(node.left);
                }
                if(node.right!=null&&!visited.contains(node.right)){
                    q.offer(node.right);
                    visited.add(node.right);
                }
                if(parent.get(node)!=null&&!visited.contains(parent.get(node))){
                    q.offer(parent.get(node));
                    visited.add(parent.get(node));
                }
            }
            distance++;
        }
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }

}