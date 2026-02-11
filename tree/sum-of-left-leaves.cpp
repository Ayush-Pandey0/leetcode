/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    int sumOfLeftLeaves(TreeNode* root) {
        if (!root) return 0;
        int sum = 0;
        if (root->left) {
            // check if left child is a leaf
            if (!root->left->left && !root->left->right)
                sum += root->left->val;
            else
                sum += sumOfLeftLeaves(root->left);
        }
        // always recurse right (it may contain left leaves deeper)
        sum += sumOfLeftLeaves(root->right);
        return sum;
    }
};
