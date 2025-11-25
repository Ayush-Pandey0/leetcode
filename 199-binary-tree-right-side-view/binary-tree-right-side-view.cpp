class Solution {
public:
    vector<int> rightSideView(TreeNode* root) {
        vector<int> res;
        f(root, 0, res);
        return res;
    }

    void f(TreeNode* node, int level, vector<int> &res) { // <- pass by reference
        if (node == NULL) return;

        if (level == res.size()) {
            res.push_back(node->val);  // first node at this level = rightmost
        }

        f(node->right, level + 1, res);
        f(node->left, level + 1, res);
    }
};
