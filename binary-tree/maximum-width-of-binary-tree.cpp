class Solution {
public:
    int widthOfBinaryTree(TreeNode* root) {
        if (!root) return 0;

        long long maxWidth = 0;
        queue<pair<TreeNode*, long long>> q; 
        q.push({root, 1}); // node, index

        while (!q.empty()) {
            int size = q.size();
            long long start = q.front().second;  // first index of this level
            long long end = q.back().second;     // last index of this level
            maxWidth = max(maxWidth, end - start + 1);

            while (size--) {
                auto [node, idx] = q.front();
                q.pop();

                long long newIdx = idx - start; // normalize to avoid overflow

                if (node->left)
                    q.push({node->left, newIdx * 2});
                if (node->right)
                    q.push({node->right, newIdx * 2 + 1});
            }
        }

        return maxWidth;
    }
};
