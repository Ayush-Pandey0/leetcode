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
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> ans;
        if (root == NULL) return ans;

        queue<TreeNode*> q;
        q.push(root);

        while (!q.empty()) { // <-- add ()
            int size = q.size(); // store current level size
            vector<int> level;

            for (int i = 0; i < size; i++) {
                TreeNode* node = q.front(); // use same name "node"
                q.pop();

                if (node->left) q.push(node->left);   // use q.push(), not q.push_back()
                if (node->right) q.push(node->right);

                level.push_back(node->val);
            }

            ans.push_back(level);
        }

        return ans;
    }
};
