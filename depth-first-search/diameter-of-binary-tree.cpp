class Solution {
public:
    int maxi = 0;  // store the diameter

    int height(TreeNode* root) {
        if (root == nullptr)
            return 0;
        int lh = height(root->left);
        int rh = height(root->right);
        maxi = max(maxi, lh + rh);  // update max diameter
        return 1 + max(lh, rh);     // return height
    }

    int diameterOfBinaryTree(TreeNode* root) {
        height(root);
        return maxi;
    }
};
