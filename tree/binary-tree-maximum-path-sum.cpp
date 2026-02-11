class Solution {
public:
    int path = INT_MIN;

    int findpath(TreeNode* node) {
        if (node == nullptr)
            return 0;

        // Ignore negative paths
        int left = max(0, findpath(node->left));
        int right = max(0, findpath(node->right));

        // Update global max path
        path = max(path, left + right + node->val);

        // Return max single path sum
        return node->val + max(left, right);
    }

    int maxPathSum(TreeNode* root) {
        findpath(root);
        return path;
    }
};
