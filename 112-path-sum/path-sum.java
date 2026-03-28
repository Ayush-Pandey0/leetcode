class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        // leaf node
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }

        // check left or right
        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }
}