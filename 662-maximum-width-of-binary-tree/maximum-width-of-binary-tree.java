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
    public int widthOfBinaryTree(TreeNode root) {
        int maxw = 0;
        if (root == null)
            return maxw;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while (!q.isEmpty()) {
            int size = q.size();
            // int minindex=q.peek().index;
            int first = 0, last = 0;
            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                TreeNode node=p.node;
                int ind=p.index;
                if(i==0)  first=p.index;
                if(i==size-1)  last=p.index;

                if(node.left!=null) {
                    q.offer(new Pair(node.left,2*ind+1));
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right,2*ind+2));
                }
            }
            maxw=Math.max(maxw,last-first+1);
        }
        return maxw;
    }
}

class Pair {
    int index;
    TreeNode node;

    Pair(TreeNode node, int index) {
        this.index = index;
        this.node = node;
    }
}