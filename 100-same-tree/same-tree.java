class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> que = new LinkedList<>();

        que.add(p);
        que.add(q);

        while(!que.isEmpty()){
            TreeNode first = que.poll();
            TreeNode second = que.poll();

            if(first == null && second == null) continue;
            if(first == null || second == null) return false;
            if(first.val != second.val) return false;

            que.add(first.left);
            que.add(second.left);
            que.add(first.right);
            que.add(second.right);
        }

        return true;
    }
}