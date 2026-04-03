class Solution {

    public int amountOfTime(TreeNode root, int start) {

        // Step 1: parent map + find target
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        TreeNode targetNode = markParent(root, parent, start);

        // Step 2: BFS
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        q.offer(targetNode);
        visited.add(targetNode);

        int distance = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (curr.left != null && !visited.contains(curr.left)) {
                    q.offer(curr.left);
                    visited.add(curr.left);
                }

                if (curr.right != null && !visited.contains(curr.right)) {
                    q.offer(curr.right);
                    visited.add(curr.right);
                }

                if (parent.get(curr) != null && !visited.contains(parent.get(curr))) {
                    q.offer(parent.get(curr));
                    visited.add(parent.get(curr));
                }
            }

            distance++; // increase every level
        }

        return distance - 1; // 🔥 your logic
    }

    private TreeNode markParent(TreeNode root,
                                Map<TreeNode, TreeNode> parent,
                                int target) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        TreeNode targetNode = null;

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node.val == target) targetNode = node;

            if (node.left != null) {
                parent.put(node.left, node);
                q.offer(node.left);
            }

            if (node.right != null) {
                parent.put(node.right, node);
                q.offer(node.right);
            }
        }

        return targetNode;
    }
}