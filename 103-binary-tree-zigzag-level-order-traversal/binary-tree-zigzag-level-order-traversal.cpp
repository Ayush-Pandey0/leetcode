class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> v;
        if (root == NULL) return v;

        queue<TreeNode*> q;
        q.push(root);

        int flag = 0;

        while (!q.empty()) {
            int size = q.size();
            vector<int> level(size);

            for (int i = 0; i < size; i++) {
                TreeNode* node = q.front();
                q.pop();

                // choose index based on direction
                int ind = (flag == 0) ? i : (size - 1 - i);

                level[ind] = node->val;

                if (node->left) q.push(node->left);
                if (node->right) q.push(node->right);
            }

            v.push_back(level);
            flag = !flag; // toggle direction
        }

        return v;
    }
};
